package gui.flowlayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));

//        you can do this in panels instead of a frame too

        JButton[] buttons = {
                new JButton("1"),
                new JButton("2"),
                new JButton("3"),
                new JButton("4"),
                new JButton("5"),
                new JButton("6"),
                new JButton("7"),
                new JButton("8"),
                new JButton("9"),
                new JButton("0")
        };

        for(JButton i : buttons){
            frame.add(i);
        }

        frame.setVisible(true);
    }
}
