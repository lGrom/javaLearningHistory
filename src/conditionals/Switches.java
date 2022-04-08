package conditionals;

import java.util.Scanner;

public class Switches {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What day is it?");
		String day = s.nextLine();
		
		switch(day.toLowerCase()) {
			case "sunday": 
				System.out.printf("It is %s", day);
				break;
			case "monday":
				System.out.printf("It is %s", day);
				break;
			case "tuesday":
				System.out.printf("It is %s", day);
				break;
			case "wednesday":
				System.out.printf("It is %s", day);
				break;
			case "thursday":
				System.out.printf("It is %s", day);
				break;
			case "friday":
				System.out.printf("It is %s", day);
				break;
			case "saturday":
				System.out.printf("It is %s", day);
				break;
			default: 
				System.out.printf("\"%s\" is not a either not a day or is misspelled.", day);
				break;
		}
		
		s.close();
		
	}
}
