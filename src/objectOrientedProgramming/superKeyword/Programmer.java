package objectOrientedProgramming.superKeyword;

public class Programmer extends Person{
	String language;
	
	Programmer(String language, String name, int age){
		// this refers to this class, super refers to parent class
		super(name, age);
		this.language = language;
		
	}
}
