package variables;

public class Arrays {
	public static void main (String[] args) {
		String[] languages = new String[3];
		
		languages[0] = "Java";
		languages[1] = "Javascript";
		languages[2] = "Python";
		
		for(int i = 0; i < languages.length; i++) {
			System.out.println(languages[i]);
		}
	}
}
