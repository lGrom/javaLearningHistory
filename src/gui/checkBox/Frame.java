package gui.checkBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JCheckBox checkBox1;
    JButton button;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("check box");
        this.setLayout(new GridLayout(3, 1));
        this.setPreferredSize(new Dimension(300, 150));
        this.setMinimumSize(new Dimension(300, 150));

        checkBox = new JCheckBox();
        checkBox.setText("Do you like dogs?");

        checkBox1 = new JCheckBox();
        checkBox1.setText("Do you like cats?");

        button = new JButton();
        button.setText("Enter");
        button.addActionListener(this);

        this.add(checkBox1);
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            String message = "You like ";
            if (!checkBox.isSelected() && !checkBox1.isSelected()) {
                return;
            }
            if (checkBox1.isSelected()) {
                message += "cats";
            }
            if (checkBox.isSelected() && checkBox1.isSelected()) {
                message += " and ";
            }
            if (checkBox.isSelected()) {
                message += "dogs";
            }

            JOptionPane.showMessageDialog(null, message + ".", "Notification", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
