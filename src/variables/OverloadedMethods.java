package variables;

public class OverloadedMethods {

	public static void main(String[] args) {
		// overloaded methods are basically just normal methods but for different types of inputs
		
		// char + char
		String cc = add('c', 'c');
		
		// float + float
		float piPlusSqrtTwo = add(3.141592f, 1.414213f);
		
		System.out.println(cc);
		System.out.println(piPlusSqrtTwo);
	}
	
	// declaring the type returned is NOT exclusive to overloaded methods
	static int add(int a, int b) {
		return a + b;
	}
	
	static String add(String a, String b) {
		return a + b;
	}
	
	static float add(float a, float b) {
		return a + b;
	}
	
	static long add(long a, long b) {
		return a + b;
	}
	
	static String add(char a, char b) {
		Character c = a;
		Character d = b;
		return c.toString()+d.toString();
	}
	
	static int add(byte a, byte b) {
		return a + b;
	}

}
