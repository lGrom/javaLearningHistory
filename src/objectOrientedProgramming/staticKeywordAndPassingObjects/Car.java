package objectOrientedProgramming.staticKeywordAndPassingObjects;

public class Car {
	
	String name;
	static int numofCars = 0;
	
	Car(String name){
		this.name = name;
		numofCars++;
	}
}
