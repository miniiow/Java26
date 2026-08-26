package homework;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		int a = sc.nextInt();	// 전공
		System.out.print("고양 이수 학점 : ");
		int b = sc.nextInt();	// 교양
		System.out.print("일반 이수 학점 : ");
		int c = sc.nextInt();	// 일반
		
		if((a >= 70) && ((b >= 30) || (c >= 30) || ((b+c) >= 80))) {
			if((a + b + c) >= 140) {
				System.out.println("졸업 가능 !!");
			}
		}
		else {
			System.out.println("졸업 불가능 ...");
		}
	}
}
