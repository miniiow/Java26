package grammar;

import java.util.Scanner;

public class Star06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i <= num; i++) {
			for(int y = 0 ; y < i ; y++) {
				System.out.print(" ");
			}
			for(int j = (num * 2)-1 ; j > (i*2)-2 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
