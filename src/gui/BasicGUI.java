package gui;

import javax.swing.JOptionPane;

public class BasicGUI {

	public static void main(String[] args) {
		
		System.out.println("Hello world. It's been a while");
		
		String name = JOptionPane.showInputDialog("Enter your name");
		String age = JOptionPane.showInputDialog("How old are you");
		JOptionPane.showMessageDialog(null, "Hi " + name + "! You are " + age + " years old.");
		
		String name2 = JOptionPane.showInputDialog("What the name of the other person with you?");
		String age2 = JOptionPane.showInputDialog("How old is " + name2 + "?");
		JOptionPane.showMessageDialog(null, "Oh dang a " + age + " year old named " + name + " with a " + age2 + " year old named " + name2 +". Nice.");

	}

}
