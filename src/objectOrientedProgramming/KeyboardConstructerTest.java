package objectOrientedProgramming;

public class KeyboardConstructerTest {
	public static void main(String[] args) {
		KeyboardConstructer dreamKeyboard = new KeyboardConstructer(true, true, "Custom greyscale", "Cherry MX", 3, 60);
		KeyboardConstructer schoolKeyboard = new KeyboardConstructer(true, false, "Unknown", "Unknown", 10, 100);
		KeyboardConstructer k = new KeyboardConstructer(true, true, "Custom something", "Cherry MX", 1, 60);
		//You can overload Constructors too
		//You can put these in arrays too
		
		KeyboardConstructer[] keyboards = {dreamKeyboard, schoolKeyboard, k};
		
		dreamKeyboard.printSpecs();
		schoolKeyboard.printSpecs();
		k.printSpecs();
		
		System.out.printf("The school keyboard is %s%% of a full keyboard", schoolKeyboard.percent);
	}
}
