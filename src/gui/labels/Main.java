package gui.labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon logS = new ImageIcon("src/gui/log_small.png");
        ImageIcon logB = new ImageIcon("src/gui/log_600.png");
        Border border = BorderFactory.createLineBorder(Color.white, 5);

        JLabel label = new JLabel(); // creates label
        label.setText("Here's a nice log"); // sets text of label
        label.setIcon(logB);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x000000)); // changes the font color
        label.setFont(new Font("Courier",Font.PLAIN,20)); // sets font and font size
        label.setIconTextGap(10);
        label.setBackground(Color.LIGHT_GRAY); // makes the background black
        label.setOpaque(true);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER); // sets the text and image to be centered horizontally

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(logB.getIconWidth(), logB.getIconHeight()+80);
        frame.setIconImage(logS.getImage());
        frame.setVisible(true);
        frame.add(label);
    }
}
