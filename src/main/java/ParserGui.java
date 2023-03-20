//     package parsercontroller;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;

/**
 *
 * @author Ed van Doorn
 */
public class ParserGui implements ActionListener {

    private ParserController controller;
    private JFrame jframe;
    private JPanel jpanelNorth, jpanelCenter, jpanelSouth;
    private JFileChooser chooser;
    private JList<String> jlist;
    private DefaultListModel<String> listModel;

    ParserGui(ParserController caller) {
        controller = caller;

        jpanelNorth = new JPanel(new GridLayout(2, 1));
        jpanelNorth.add(new JLabel("Selecteer de map waarin en waaronder"));
        jpanelNorth.add(new JLabel("de Java files zich bevinden."));
        jpanelNorth.setBackground(Color.yellow);

        chooser = new JFileChooser();

        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select Map");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addActionListener(this);

	jpanelSouth = new JPanel(new GridLayout(2, 1));

        jframe = new JFrame("");

        jframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );

        jframe.getContentPane().add(jpanelNorth, "North");
        jframe.getContentPane().add(chooser,     "Center");
	jframe.getContentPane().add(jpanelSouth, "South");

        jframe.pack();
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        switch (cmd) {
            case "ApproveSelection":
                File map = chooser.getSelectedFile();

                changeToParseUi(map);
                controller.parseFiles(map);
                break;
            case "CancelSelection":
                exitMessage("Geen map geselecteerd.\nEinde programma.");
                break;
            default:
                exitMessage("Onbekende opdracht: " + cmd + "\nEinde programma. Informeer Ed.");
                break;
        }
    }

    private void changeToParseUi(File file) {
        jframe.getContentPane().remove(chooser);
        /* chooser wordt wordt niet meer gebruikt */

        listModel = new DefaultListModel();
        jlist = new JList(listModel);

        jpanelCenter = new JPanel(new BorderLayout());
        jpanelCenter.add(new JLabel("Geparst zijn:"), "North");
        jpanelCenter.add(jlist, "Center");

        jframe.getContentPane().add(jpanelCenter, "Center");

        jpanelNorth.removeAll();
        jpanelNorth.setBackground(Color.green);
        jpanelNorth.add(new JLabel("Start parsing Java files in/onder " + file.getAbsolutePath() + "  "));

        jframe.pack();
    }

    void addFilenameToList(String name) {
        listModel.addElement(name);

        jframe.pack();
    }


    void showEndPanel() {
	JButton endBtn;
	JPanel panel;

	panel = new JPanel();
	panel.setLayout(new GridLayout(1, 4));
	panel.add(new JLabel(" "));
	panel.add(new JLabel(" "));
	panel.add(new JLabel(" "));

	endBtn = new JButton("Ok");
	endBtn.setBackground(Color.yellow);
	endBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

	panel.add(endBtn);

	JLabel lbl = new JLabel("All files are parsed");

	lbl.setBackground(Color.green);
	lbl.setOpaque(true);
	// https://stackoverflow.com/questions/2380314/how-do-i-set-a-jlabels-background-color
	
	jpanelSouth.add(lbl);
	jpanelSouth.add(panel);

	jframe.pack();
    }

    void exitMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "",
                JOptionPane.OK_OPTION);

        System.exit(1);
    }
}
