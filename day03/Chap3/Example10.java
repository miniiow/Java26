package Chap3;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		}
		else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
	}
	
	public static boolean isPrime(int num) {
		boolean result = true;
		
		if(num == 1) {
			result = false;
			return result;
		}
		
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				result = false;
				break;
			}
			
		}
		return result;
	}
}
