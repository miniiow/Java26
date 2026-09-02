package Chap3;

public class Example08 {
	public static int factorial(int num) {
		int result = 1;
		
		switch (num) {
			case 0 -> {
				return result;
			}
			default -> {
				for(int i = 1 ; i <= num ; i++) {
					result *= i;
				}
			}	
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
