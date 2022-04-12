package variables;

public class Methods {

	public static void main(String[] args) {
		helloWorld();
		say("Again!", true);
		helloWorld();
	}
	
	static void helloWorld() {
		System.out.println("Hello world. I'm calling you from a method.");
	}
	
	static void say(String message, boolean newLine) {
		if(newLine) { 
			message += "\n";
		}
		
		System.out.printf(message);
	}
	
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
	
	static String add(Character a, Character b) {
		return a.toString()+b.toString();
	}
	
	static int add(byte a, byte b) {
		return a + b;
	}
}
