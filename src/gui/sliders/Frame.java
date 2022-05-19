package gui.sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame implements ChangeListener {

        JSlider slider;
        JLabel label;

        Frame() {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new GridLayout(2, 1));
                this.setResizable(false);

                label = new JLabel();
                label.setHorizontalAlignment(JLabel.CENTER);

                slider = new JSlider(SwingConstants.HORIZONTAL, 0, 10, 5);
                slider.setSize(new Dimension(100, 10));
                slider.addChangeListener(this);
                slider.setPaintTicks(true);
                slider.setMinorTickSpacing(1);
//              slider
                slider.setPaintTrack(true);
                slider.setMajorTickSpacing(5);
                slider.setPaintLabels(true);
                slider.setSize(new Dimension(slider.getWidth()-10, slider.getHeight()));
                slider.setFont(new Font("Bahnschrift", Font.PLAIN, 15));

                label.setText("Current slider value: " + slider.getValue());

                this.add(label);
                this.add(slider);
                this.pack();
                this.setVisible(true);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
                label.setText("Current slider value: " + slider.getValue());
        }
}
