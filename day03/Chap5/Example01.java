package Chap5;

public class Example01 {
	public static void main(String[] args) {
		System.err.println(countChar("hello", 'l'));
	}
	
	public static int countChar(String str, char c) {
		int count = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
