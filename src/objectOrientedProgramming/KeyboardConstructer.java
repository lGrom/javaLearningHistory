package objectOrientedProgramming;

public class KeyboardConstructer {
	
	Boolean mechanical;
	Boolean custom;
	String keyCaps;
	String switches;
	Integer inputLagMS;
	Integer percent;
	
	KeyboardConstructer(Boolean mechanical, Boolean custom, String keyCaps, String switches, Integer inputLagMS, Integer percent){
		this.mechanical = mechanical;
		this.custom = custom;
		this.keyCaps = keyCaps;
		this.switches = switches;
		this.inputLagMS = inputLagMS;
		this.percent = percent;
		// put all the variables above here
		String[] specList = {this.keyCaps};
	}
	
	void printSpecs() {
		System.out.printf();
	}
}
