package objectOrientedProgramming.keyboardConstructer;

public class Keyboard {
	
	Boolean mechanical = true;
	Boolean custom = true;
	String keyCaps = "Custom grey theme";
	String switches = "Cherry MX";
	Integer inputLagMS = 3;
	Integer percent = 60;
	
	String[] specs = {mechanical.toString(), custom.toString(), keyCaps, switches, inputLagMS.toString(), percent.toString()};
	String[] variables = {"mechanical", "custom", "key caps", "switches", "input lag (in ms)", "percent of keyboard"};
	
	void printSpecs() {
		int j = 0;
		for(String i : specs) {
			System.out.printf("%s: %s\n",variables[j],i);
			j++;
		}
	}
}
