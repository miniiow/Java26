package homework;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14;
		System.out.print("원기둥의 밑면 반지름은? ");
		int u = sc.nextInt();
		System.out.print("원기둥의 높이는? ");
		int h = sc.nextInt();
		
		System.out.printf("원기둥의 부피는 %.1f", (u * u * pi * h));
	}
}
