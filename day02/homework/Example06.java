package homework;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하세요 : ");
		double f = sc.nextDouble();
		double c = ((double)5/9) * (f - 32);
		System.out.printf("%.2f", c);
	}
}
