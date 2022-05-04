package gui.lgrom;

import javax.swing.*;
import java.awt.*;

public class lGromFrame extends JFrame {
    lGromFrame(){
        this.setTitle("lgrom.github.io");
        // can be set to JFrame.DO_NOTHING_ON_CLOSE to prevent closing the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application instead of hiding
        this.setResizable(false); // prevents resizing the frame
        this.setSize(500, 500); // sets the width and height
        this.setVisible(true); // makes the frame visible

        ImageIcon image = new ImageIcon("src/gui/log_small.png");
        this.setIconImage(image.getImage()); // change icon for frame
        this.getContentPane().setBackground(new Color(0x8c6fab));
    }
}
