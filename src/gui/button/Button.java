package gui.button;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {

    JButton button;

    Button() {

        button = new JButton();
        button.setBounds(50, 20, 400, 200);
//        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("you clicked me :D"));
        button.setText("Click me please");
        button.setFocusable(false);
        button.setBackground(new Color(0xf0ffff));
        button.setCursor(new Cursor(Cursor.WAIT_CURSOR));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == button) {
//            System.out.println("you clicked me :)");
//        }
//    }
}
