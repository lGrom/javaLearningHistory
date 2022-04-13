package objectOrientedProgramming;

public class BasicOOP {
	public static void main(String[] args) {
		Keyboard mainKeyboard = new Keyboard();
		
		System.out.printf("This is a %s%% keyboard\n\n",mainKeyboard.percent);
		mainKeyboard.printSpecs();
	}
}
