package objectOrientedProgramming.staticKeywordAndPassingObjects;

public class Garage {

	static int numParkedCars = 0;
	
	void park(Car car1) {
		System.out.printf("The %s is parked in the garage\n", car1.name);
		numParkedCars++;
	}
	
	static void displayNumberOfCars() {
		System.out.printf("You have %s car(s) in the garage", numParkedCars);
	}
}
