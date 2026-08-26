package homework;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(((num % 4 == 0) && (num % 5 == 0))) {
			System.out.println("true");
		}
		else if(((num % 4 == 0) || (num % 5 == 0))){
			System.out.println("true");
		}
		else if((((num % 4 == 0)||(num % 5 == 0)) != ((num % 4 == 0) && (num % 5 == 0)))) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// 삼항연산자 사용
		System.out.println(((num % 4 == 0) && (num % 5 == 0)) ? true : false);
		System.out.println(((num % 4 == 0) || (num % 5 == 0)) ? true : false);
		System.out.println((((num % 4 == 0)||(num % 5 == 0)) != ((num % 4 == 0) && (num % 5 == 0))) ? true : false );
	}
}