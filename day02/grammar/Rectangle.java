package grammar;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이 : ");
		double w = sc.nextDouble();
		System.out.print("직사각형의 세로 길이 : ");
		double h = sc.nextDouble();
		
		System.out.printf("직사각형의 넓이는 %.1f입니다.", w*h);
	}

}
