package objectOrientedProgramming.overriding;

public class Dog extends Animal{

//	Dog(String name){
//		super this.name=name;
//	}
	
	// @Override lets the IDE and others know that this is a method being overridden from the parent class
	@Override
	void speak() {
		System.out.println("Wolf or Bark or Bow wow idrc");
	}

}
