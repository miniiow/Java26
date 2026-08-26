package homework;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		if(num < 3600) {
			min = num / 60;
			sec = num % 60;
		}
		else {
			hour = num / (60 * 60);
			min = (num % (60 * 60)) / 60;
			sec = num % 60;
		}
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
	}
}
