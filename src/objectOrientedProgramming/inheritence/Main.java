package objectOrientedProgramming.inheritence;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.go();
		car.stop();
		System.out.println(car.brand + " " + car.speed);
		System.out.println();
	}
}
