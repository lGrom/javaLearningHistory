package objectOrientedProgramming.inheritence;

// this is also demoing abstract

//abstract makes it so that you cant have an instance of the contructer itself,
//but you can have an instance of a child class
public abstract class Vehicle {
	
	double speed;
	
	void go() {
		System.out.println("brrrrr");
	}
	void stop() {
		System.out.println("screech");
	}
	
	// Forces child classes to have a method called printType
	abstract void printType();
}
