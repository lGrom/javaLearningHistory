package loops;

import java.util.Scanner;

public class NestedLoops {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("What do you want to repeat?");
		String repeated = s.nextLine();
		
		System.out.println("How many rows do you want?");
		int rows = s.nextInt();
		
		System.out.println("How many columns do you want?");
		int columns = s.nextInt();
		
		for(int i = 0; i < rows; i++) {
			for(int o = 0; o < columns; o++) {
				System.out.print(repeated);
			}
			System.out.println();
		}
	}
}
