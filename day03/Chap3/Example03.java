package Chap3;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int result = 0;
		
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = sc.nextInt();
			
			if(n % 2 == 0) {
				result += n;
			}
			
		} while (n > 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + result);
	}
}
