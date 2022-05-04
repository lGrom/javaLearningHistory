package gui;

import javax.swing.*;
import java.awt.*;

public class SimpleJFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // makes a frame

        frame.setTitle("lgrom.github.io");
        // can be set to JFrame.DO_NOTHING_ON_CLOSE to prevent closing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application instead of hiding
        frame.setResizable(false); // prevents resizing the frame
        frame.setSize(500, 500); // sets the width and height
        frame.setVisible(true); // makes the frame visible

        ImageIcon image = new ImageIcon("src/gui/log_small.png");
        frame.setIconImage(image.getImage()); // change icon for frame
        frame.getContentPane().setBackground(new Color(0x8c6fab));
    }
}
