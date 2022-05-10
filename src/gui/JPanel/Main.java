package gui.JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("hey there");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 500);

        JLabel label1 = new JLabel();
        label1.setText("how's it going?");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setBounds(0, 25, 250, 225);

        JLabel label2 = new JLabel();
        label2.setText("what's going on?");
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.BOTTOM);
        label2.setBounds(0, 0, 250, 225);

        JPanel red = new JPanel();
        red.setBackground(Color.red);
        red.setBounds(0, 0, 250, 500);
        red.setLayout(null);
        red.add(label);

        JPanel blue = new JPanel();
        blue.setBackground(new Color(0x9D00FF));
        blue.setBounds(250, 0, 250, 250);
        blue.setLayout(null);
        blue.add(label1);

        JPanel green = new JPanel();
        green.setBackground(Color.ORANGE);
        green.setBounds(250,250, 250, 250);
        green.setLayout(null);
        green.add(label2);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("src/gui/log_small.png");
        frame .setIconImage(image.getImage()); // change icon for frame
        frame.add(red);
        frame.add(blue);
        frame.add(green);
    }
}
