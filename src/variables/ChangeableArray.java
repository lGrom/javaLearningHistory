package variables;

import java.util.ArrayList;

public class ChangeableArray {
	public static void main (String[] args) {
		// The difference between a normal array and an ArrayList is that an array list can be changed during runtime
		// If you want to store primitives like int's or booleans you have to use the wrapper class
		// 
		// ex. ArrayList<Boolean> or ArrayList<Integer>
		
		ArrayList<String> food = new ArrayList<String>(); 
		
		food.add("noodles");
		food.add("pasta with no sauce");
		food.add("food is a food");
		
		food.set(1, "pasta with some sauce");
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.printf("\n\n%s", food);
	}
}
