package gui.textfield;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Enter");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
        textField.setForeground(new Color(0xeeeeee));
        textField.setBackground(Color.BLACK);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JOptionPane.showMessageDialog(null, textField.getText(), "What you typed", JOptionPane.INFORMATION_MESSAGE);
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
