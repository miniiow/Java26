package grammar;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int coin = sc.nextInt();
		int five = 0;
		int one = 0;
		
		five = coin / 500;
		coin = (coin % 500) / 100;
		one = coin;
		
		System.out.println("동전의 수 >");
		System.out.printf("500원짜리 = %d개\n", five);
		System.out.printf("100원짜리 = %d개\n", one);
	}
}
