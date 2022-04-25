package package2;

import package1.*;

public class C {

	// Since this has the default protections, other classes in the package can see this, 
	// but classes outside of this package cannot
	String defaultMessage = "This is the default";
	
	// public keyword makes the variable visible to all classes in the project.
	// note: these keywords work with classes
	public String publicMessage = "This is public";
	
	// Can be used in subclasses of the package it's in. So if the protected variable is in A,
	// you can make a class that extends A and it will have access to that variable.
	protected String protectMessage = "This is protected";
	
	// Can only be used by the class it's in, any other classes, including sub classes, will
	// not have access to the variable.
	private String privateMessage = "This is private";
}
