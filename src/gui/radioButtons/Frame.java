package gui.radioButtons;

import package1.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JRadioButton light;
    JRadioButton dark;

    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ButtonGroup themes = new ButtonGroup();
        light = new JRadioButton("Light mode");
        dark = new JRadioButton("Dark mode");
        light.addActionListener(this);
        dark.addActionListener(this);
        themes.add(light);
        themes.add(dark);

        setTheme(Color.white, Color.black);

        this.add(light);
        this.add(dark);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == light) {
            setTheme(Color.white, Color.black);
        }
        if(e.getSource() == dark) {
            setTheme(Color.black, Color.white);
        }
    }

    private void setTheme (Color backgroundColor, Color textColor) {
        this.setBackground(backgroundColor);
        this.setForeground(textColor);
        this.pack();
        this.revalidate();
        // fix this later
        System.out.println("Tried to change theme");
    }
}
