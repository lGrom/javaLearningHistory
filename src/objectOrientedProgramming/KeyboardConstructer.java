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
	}
	
	void printSpecs() {
		String[] specList = {"mechanical", "custom", "key caps", "switches", "input lag in ms", "percent"};
		String[] specs = {this.mechanical.toString(), this.custom.toString(), this.keyCaps, this.switches, this.inputLagMS.toString(), this.percent.toString()};
		int j = 0;
		for(String i : specs) {
			System.out.printf("%s: %s\n", specList[j], i);
			j++;
		}
		System.out.println();
	}
}
