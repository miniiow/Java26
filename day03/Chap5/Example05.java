package Chap5;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		
		System.out.println("숫자를 10개 입력하세요.");
		for(int i = 0; i < 10 ; i++) {
			numbers[i] = sc.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.print("0 ~ 9 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 0) && (numbers[i] < 10)) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		
		System.out.print("10 ~ 19 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 10) && (numbers[i] < 20)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("20 ~ 29 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 20) && (numbers[i] < 30)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("30 ~ 39 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 30) && (numbers[i] < 40)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("40 ~ 49 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 40) && (numbers[i] < 50)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("50 ~ 59 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 50) && (numbers[i] < 60)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("60 ~ 69 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 60) && (numbers[i] < 70)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("70 ~ 79 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 70) && (numbers[i] < 80)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("80 ~ 89 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 80) && (numbers[i] < 90)) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("90 ~ 99 : ");
		for(int i = 0 ; i<numbers.length ; i++) {
//			System.err.print(numbers[i] + " ");
			if((numbers[i] >= 90) && (numbers[i] < 100)) {
				System.out.print("*");
			}
		}

	}
}
