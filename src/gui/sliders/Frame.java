package gui.sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame implements ChangeListener {

        JSlider slider;

        Frame() {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new FlowLayout());
                this.setResizable(false);

                slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
                slider.setSize(new Dimension(100, 10));

                this.add(slider);
                this.pack();
                this.setVisible(true);
        }

        @Override
        public void stateChanged(ChangeEvent e) {

        }
}
