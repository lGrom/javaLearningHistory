package randomness;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = random.nextInt(9)+1;
		double b = random.nextDouble(6);
		boolean c = random.nextBoolean();
		
		System.out.printf("Random number 1-10: %s \n", a);
		System.out.printf("Random double 0-6: %s \n", b);
		System.out.printf("Random boolean (true/false): %s \n", c);
	}

}
