package gui.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JMenuBar menu = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem load = new JMenuItem("Load");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem save = new JMenuItem("Save");

    JMenu edit = new JMenu("Edit");
    JMenuItem rename = new JMenuItem("Rename");
    JMenuItem change_extention = new JMenuItem("Change file extension");
    JMenu help = new JMenu("Help");
    JMenuItem wiki = new JMenuItem("Wiki");
    JMenuItem repo = new JMenuItem("Github repository");
    Menu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(new Dimension(500, 500));
        this.setLayout(new FlowLayout());

        //file
        file.add(load);
        load.addActionListener(this);
        file.add(exit);
        exit.addActionListener(this);
        file.add(save);
        save.addActionListener(this);
        menu.add(file);

        //edit
        edit.add(rename);
        rename.addActionListener(this);
        edit.add(change_extention);
        change_extention.addActionListener(this);
        menu.add(edit);

        //help
        help.add(wiki);
        wiki.addActionListener(this);
        help.add(repo);
        repo.addActionListener(this);
        menu.add(help);

        this.setJMenuBar(menu);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == load) {
            System.out.println("Loading something ig");
        }
        if (e.getSource() == exit) {
            this.dispose();
        }
        if (e.getSource() == save) {
            System.out.println("Saving something i suppose");
        }
        if (e.getSource() == rename) {
            System.out.println("Renaming something to something else perhaps");
        }
        if (e.getSource() == change_extention) {
            System.out.println("I feel like this could be done with the rename thing but i need to use a slot");
        }
        if (e.getSource() == wiki) {
            System.out.println("Just google it you bafoon");
        }
        if (e.getSource() == repo) {
            System.out.println("The repository is probably private anyways");
        }

    }
}
