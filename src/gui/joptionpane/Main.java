package gui.joptionpane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "I'm a JOptionPane :O", "Option pane", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm a JOptionPane :|", "Option pane", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm a JOptionPane :?", "Option pane", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm a JOptionPane :!", "Option pane", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm a JOptionPane :(", "Option pane", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Do you want to see a smiley face?", "important question", JOptionPane.YES_NO_CANCEL_OPTION);

        JOptionPane.showMessageDialog(null, ":D", "Smiley face", JOptionPane.INFORMATION_MESSAGE);

    }
}
