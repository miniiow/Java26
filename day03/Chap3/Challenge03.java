package Chap3;

import java.util.Scanner;

public class Challenge03 {
	public static int factorial(int x) {
		int result = 1;
		
		while(true) {
			if(x > 0) {
				result *= x;
				x--;
			}
			else {
				break;
			}
		}
		
		return result;
	}
	
	public static int factorial(int x, int y) {
		int r = 1;
		
		for(int i = x ; i <= y ; i++) {
			r *= i;
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
}
