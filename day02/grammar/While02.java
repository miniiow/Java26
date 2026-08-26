package grammar;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		// 숫자를 입력 받아 짝수인지 홀수인지 판단하고, 계속 할 것인지 묻는다. 0을 입력하면 멈추고, 1이면 계속한다.
		Scanner sc = new Scanner(System.in);
		
		int num;
		int con;

		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			System.out.println(num % 2 == 0 ? ">> 짝수입니다." : ">> 홀수입니다.");

			System.out.print("계속 하시겠습니까? (0-멈춤 / 1-계속) : ");
			con = sc.nextInt();
			if(con == 1) {
				continue;
			}
			else {
				break;
			}
		}
	}
}
