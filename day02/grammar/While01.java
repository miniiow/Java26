package grammar;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		// 숫자를 계속 입력 받으면서 더하다가 0을 입력하면 멈추고 지금까지 더한 값을 출력
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num != 0) {
				sum += num;
				continue;
			}
			else {
				break;
			}
		}
		
		System.out.printf("지금까지 입력한 숫자의 합은 %d입니다.", sum);
		
	}

}
