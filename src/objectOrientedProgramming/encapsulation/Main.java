package objectOrientedProgramming.encapsulation;

public class Main {
	public static void main (String[] args) {
		Car car = new Car("Tesla", "S", 2020);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
//		car.year = 2021 doesn't work, protected
		
		car.setYear(2021);
		
		System.out.println(car.getYear());
	}
}
