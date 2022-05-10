package gui.button;

import javax.swing.*;

public class button extends JFrame {

    button() {

        JButton button = new JButton();
        button.setBounds(50, 150, 400, 200);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
