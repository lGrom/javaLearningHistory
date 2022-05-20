package gui.jProgressBar;

import objectOrientedProgramming.superKeyword.Programmer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ProgressBar extends JFrame {

    JProgressBar bar = new JProgressBar();

    ProgressBar () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 139));

        bar.setValue(0);
        bar.setBounds(0, 0, this.getWidth(), this.getHeight()-39);
        bar.setStringPainted(true);

        this.add(bar);
        this.setLayout(null);
        this.setVisible(true);

        for(int i = 0; i < 100; i++) {
            bar.setValue(i);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bar.setString("Complete");
        this.dispose();
    }

    @wonky(
            programmer = "Grom"
    )
    public void fill() {
        bar.setValue(10);
    }

}
