package grammar;

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i <= num; i++) {
			for(int y=num ; y > i ; y--) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < (i*2)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
