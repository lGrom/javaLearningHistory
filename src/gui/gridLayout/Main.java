package gui.gridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        frame.setMinimumSize(new Dimension(300, 300));

        JButton[] buttons = {
                new JButton("1"),
                new JButton("2"),
                new JButton("3"),
                new JButton("4"),
                new JButton("5"),
                new JButton("6"),
                new JButton("7"),
                new JButton("8"),
                new JButton("9")
        };
        for (JButton i: buttons) {
            frame.add(i);
        }

        frame.setVisible(true);
    }
}
