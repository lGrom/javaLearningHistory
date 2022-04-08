package loops;

import java.util.Scanner;

public class WhileLoopUseCase {

	public static void main(String[] args) {
		// Will force the user to input something as their name
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name here: ");
		String name = s.nextLine();
		
		while(name.isBlank()) {
			System.out.print("Enter your name here: ");
			name = s.nextLine();
		}
		
		System.out.printf("Hello %s!\n", name.substring(0, 1).toUpperCase()+name.substring(1));
		
		s.close();

	}

}
