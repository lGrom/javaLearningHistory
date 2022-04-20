package objectOrientedProgramming.inheritence;

public class Tech {
	String name;
	String usability;
	String shortDescription;
	int yearOfInvention;
	int yearManufactored;

	
	Tech (String name, String usability, String shortDescription, int yearOfInvention, int yearManufactored){
		this.name = name;
		this.usability = usability;
		this.shortDescription = shortDescription; // Start with "It is..."
		this.yearOfInvention = yearOfInvention;
		this.yearManufactored = yearManufactored;
	}
	
	void historyOfDevice () {
		System.out.printf("The %s was invented in %s, though this particular instance was only manufactored in %s. It is %s usable. %s.\n", this.name, this.yearOfInvention, this.yearManufactored, this.usability, this.shortDescription);
	}
}
