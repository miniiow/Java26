package Chap3;

import java.util.Scanner;

public class Challenge02 {
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		int n = sc.nextInt();
		
		System.out.println(factorial(n));

	}
}
