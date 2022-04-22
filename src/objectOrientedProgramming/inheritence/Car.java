package objectOrientedProgramming.inheritence;

public class Car extends Vehicle{
	String brand = "tesla";
	
	// This is an override, but you are required to override it
	@Override
	void printType (){
		System.out.println("This is a car");
	}
}
