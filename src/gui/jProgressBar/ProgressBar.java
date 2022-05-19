package gui.jProgressBar;

import objectOrientedProgramming.superKeyword.Programmer;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {

    JProgressBar bar = new JProgressBar();

    ProgressBar () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 80));

        bar.setValue(0);
        bar.setBounds(0, 0, this.getWidth(), this.getHeight());
        bar.setStringPainted(true);

        this.add(bar);
        this.setLayout(null);
        this.setVisible(true);
    }

}
