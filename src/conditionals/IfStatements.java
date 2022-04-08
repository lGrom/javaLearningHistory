package conditionals;

import java.util.Scanner;

public class IfStatements {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		if(age >= 18) {
			System.out.println("You're an adult :D");
		} else if (age >= 13){
			System.out.println("You're a teenager");}
		else {	
			System.out.println("You're just a wee lad");
		}
		
		scanner.close();
		
		
	}
}
