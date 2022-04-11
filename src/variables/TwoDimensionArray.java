package variables;

public class TwoDimensionArray {
	public static void main (String[] args) {
		String[][] gameLayout = {
									{"X", "X", "O"},
									{"O", "O", "X"},
									{"X", "O", "X"}
								};
		
		for(int i = 0; i < gameLayout.length; i++) {
			for(int o = 0; o < gameLayout[i].length; o++) {
				System.out.printf("%s ", gameLayout[i][o]);
			}
			System.out.println();
		}
	}
}
