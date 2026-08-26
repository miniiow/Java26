package homework;

public class Example05 {
	public static void main(String[] args) {
		char c = 'c';
		int a = 0;
		
		if((int)c >= 65 && (int)c <= 90) {
			a = (int)c + 32;
			c = (char)a;
		}
		else {
			a = (int)c - 32;
			c = (char)a;
		}
		
		System.out.println(c);
	}
}
