package Chap3;

import java.util.Scanner;

public class Challenge01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		int n = sc.nextInt();
		
		int result = 1;
		
		while(true) {
			if(n > 0) {
				result *= n;
				n--;
			}
			else {
				break;
			}
		}
		
		System.out.println(result);
	}
}
