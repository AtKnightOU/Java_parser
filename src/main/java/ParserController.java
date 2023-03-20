// package parsercontroller;

import java.util.ArrayList;
import java.io.File;

/**
 *
 * @author ed
 */
public class ParserController {
    private ParserGui gui;
    private SearchJavaSrc searchJavaSrc;
    private boolean onlyAttributeAssociation;

    public static void main(String[] args) {
        if (args.length > 1) {
	    System.out.println("onjuist aantal argumenten op de commandline " + args[1]);
	    System.exit(1);
	}

	boolean attrArg = false;

	if (args.length == 1)
	    if (args[0].equals("-a"))
	       attrArg = true;
	    else {
		System.out.println("onjuist aantal argumenten op de commandline " + args[0]);
		System.exit(1);
	    }
	
        ParserController app = new ParserController(attrArg);
    }

    ParserController(boolean attrArg) {
	onlyAttributeAssociation = attrArg;
	
        gui = new ParserGui(this);
        searchJavaSrc = new SearchJavaSrc();
    }

    public void parseFiles(File dirName) {
        /** Wordt aangeroepen vanuit ParserGui.java 
         *  De namen van de gevonden Java-files worden getoond in 
         *  ParserGui.java.
         */
        
        ArrayList<File> files;
	JavaParserHHS javaParser;

	javaParser = new JavaParserHHS(onlyAttributeAssociation);
        files = searchJavaSrc.getJavaFiles(dirName);

        for (File f : files) {
            gui.addFilenameToList(f.getAbsolutePath());
	    javaParser.parseHHS(f.getAbsolutePath());
        }

	gui.showEndPanel();
    }
}
