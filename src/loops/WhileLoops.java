package loops;

public class WhileLoops {

	public static void main(String[] args) {
		
		int repetitions = 10;
		int i = 0;
		
		while(i < repetitions) {
			System.out.printf("This loop has %s iteration(s) left! \n", (repetitions-i)-1);
			i++;
		}

	}

}
