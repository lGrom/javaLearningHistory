package gui.layeredLayout;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Main {

    static int offset = 50;

    public static void main(String[] args){




        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label(new Color(0x121212)), Integer.valueOf(0));
        layeredPane.add(label(new Color(0x707070)), Integer.valueOf(2));
        layeredPane.add(label(new Color(0xffffff)), Integer.valueOf(1));


        JFrame frame = new JFrame("jlayeredpane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(layeredPane);

    }

    public static JLabel label(Color color) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(color);
        label.setSize(new Dimension(200, 200));
        label.setBounds(offset, offset, 200, 200);
        offset += 50;
        return label;
    }
}
