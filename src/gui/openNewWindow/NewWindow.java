package gui.openNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("ty <3");


    NewWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        label.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);
        frame.setVisible(true);
    }

}
