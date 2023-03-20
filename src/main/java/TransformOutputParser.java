//package parsercontroller;

/**
 *
 * @author Ed van Doorn
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;

public class TransformOutputParser {

    /**
     * This program cleans up the output of the Java parser and moves all
     * <edges...> to the bottom of the file.
     *
     * @param args
     */
    String nameInputFile, nameOutputFile;

    public static void main(String[] args) {
        if (args.length == 0) {
            showErrorMessage("Argument input-file is missing.");
        }

        TransformOutputParser app = new TransformOutputParser(args[0]);
        app.cleanUpFile();

    }

    TransformOutputParser(String fileName) {
        this.nameInputFile = fileName;
        nameOutputFile = "inputSystem.xml";
    }

    void cleanUpFile() {
        BufferedReader f_input;
        BufferedWriter f_output;

        f_input = openInputFile(nameInputFile);
        f_output = openOutputFile(nameOutputFile);

        processLines(f_input, f_output);
    }

    private void processLines(BufferedReader f_input,
            BufferedWriter f_output) {
        
        String readLine, prefix;
        ArrayList<String> edges;

        edges = new ArrayList();

        try {
            f_output.write("<templates>" + "\n");
            f_output.write("   <template name='Systeem'>" + "\n");
            prefix = "       ";

            while ((readLine = f_input.readLine()) != null) {
                if (readLine.startsWith("<edge ")) {
                    edges.add(readLine);
                } else if (!(readLine.startsWith("Parsing"))
                        && !(readLine.startsWith("No errors"))) {
                    f_output.write(prefix + readLine + "\n");
                }
            }

            for (String edge : edges) {
                f_output.write(prefix + edge + "\n");
            }

            f_output.write("   </template>" + "\n");
            f_output.write("</templates>" + "\n");

            f_input.close();
            f_output.close();
        } catch (IOException e) {
            showErrorMessage("Problem with reading file " + nameInputFile
                    + "\n" + "or writing file " + nameOutputFile);
        }
    }

    private BufferedReader openInputFile(String fileName) {
        try {
            File f = new File(fileName);

            return new BufferedReader(new FileReader(f));

        } catch (IOException e) {
            showErrorMessage("Problem to open " + fileName);
        }

        return null;
    }

    private BufferedWriter openOutputFile(String fileName) {
        try {
            return new BufferedWriter(new FileWriter(fileName));

        } catch (IOException e) {
            showErrorMessage("Problem to open " + fileName);
        }

        return null;
    }

    static void showErrorMessage(String msg) {
        String abort = "Program will abort.";

        JOptionPane.showMessageDialog(null, msg + "\n" + abort, "Error!",
                JOptionPane.ERROR_MESSAGE);

        System.exit(1);
    }
}
