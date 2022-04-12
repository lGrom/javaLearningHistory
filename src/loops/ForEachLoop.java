package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		// this works the same with an ArrayList (literally nothing changes beside the array)
		String[][] board = {{"X", "O", "X"}, {"X", "X", "O"}, {"O", "O", "X"}};
		
		for(String[] i : board) {
			for(String j : i) {
				System.out.printf("%s ", j);
			}
			System.out.println();
		}

	}

}
