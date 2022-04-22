package objectOrientedProgramming.superKeyword;

public class Main {
	public static void main (String[] args) {
		Programmer iGrom = new Programmer("Java", "Grom", 13);
		System.out.printf("%s, age %s, writes in %s", iGrom.name, iGrom.age, iGrom.language);
	}
}
