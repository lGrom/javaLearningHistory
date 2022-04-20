package objectOrientedProgramming.staticKeywordAndPassingObjects;

public class PassObjectAsArgument {

	public static void main(String[] args) {


		Garage garage = new Garage();
		
		Car car = new Car("BMW");
		Car car2 = new Car("Tesla");
		Car car3 = new Car("Car name");
		
		garage.park(car);
		garage.park(car2);
//		garage.park(car3);

		System.out.printf("You have %s car(s)\n", Car.numofCars);
		
//		A static method can have parameters.
		Garage.displayNumberOfCars();
	}

}
