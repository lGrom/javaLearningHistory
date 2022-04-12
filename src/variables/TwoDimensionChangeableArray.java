package variables;

import java.util.*;

public class TwoDimensionChangeableArray {

	public static void main(String[] args) {
		
		// Overall array that will have the other arrays
		ArrayList<ArrayList<String>> gameBoard = new ArrayList();
		
		// Arrays that go into the gameBoard array
		ArrayList<String> row1 = new ArrayList();
		row1.add("X");
		row1.add("O");
		row1.add("X");
		
		ArrayList<String> row2 = new ArrayList();
		row2.add("X");
		row2.add("X");
		row2.add("O");
		
		ArrayList<String> row3 = new ArrayList();
		row3.add("O");
		row3.add("O");
		row3.add("X");
		
		gameBoard.add(row1);
		gameBoard.add(row2);
		gameBoard.add(row3);
		
		System.out.println(gameBoard);
		
		
	}

}
