package grammar;

import java.util.Scanner;

public class Star04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i <= num; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
			}
			for(int y=num ; y > i ; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
