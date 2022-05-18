package gui.comboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Frame extends JFrame implements ActionListener {

    JComboBox animal;
    JButton enter;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setName("Dogs vs Cats");

        String[] options = {"Dogs", "Cats", "Both", "Neutral"};
        animal = new JComboBox(options);
        animal.addActionListener(this);
        animal.setSelectedIndex(/* You can have comments like this? */ 3);
        // animal.insertAt("pig", 0);  animal.removeItem(String or index);

        enter = new JButton("Enter");
        enter.addActionListener(this);

        JLabel label = new JLabel();
        label.setText("Select the animal you like better then press enter: ");

        this.add(enter);
        this.add(label);
        this.add(animal);
        this.pack();
        this.setVisible(true);
        this.setMinimumSize(this.getSize());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter && animal.getSelectedItem() != null) {
            String message;
            if (animal.getSelectedItem() == "Neutral") {
                message = "neither animal more than the other";
            } else {
                message = animal.getSelectedItem().toString().toLowerCase();
            }

            JOptionPane.showMessageDialog(null, "You like " + message + ".", "Your favorite animal", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == enter) {
            System.out.println("How did you break this");
        }
        if (e.getSource() == animal) {
            System.out.println("Combo box changed");
        }
    }
}
