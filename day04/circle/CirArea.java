package circle;

import java.util.Scanner;

public class CirArea {
	// num은 객체 생성없이 사용할 수 있다
	static int num = 10;
	
	public static void main(String[] args) {
		System.out.println(num);
		num = 100;
		System.out.println(num);
		
		
		// 원의 반지름을 입력받아 넓이를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 입력 : ");
		double radius = sc.nextDouble();
		
		
		// Circle 객체 생성
		Circle c = new Circle(radius);
		
		// Circle 객체에게 면적 계산 요청
		double area = c.getArea();
		
		// 계산된 면적을 출력
		System.out.printf("[객체] 반지름이 %.2f인 원의 넓이는 %.2f입니다.\n", c.getRadius(), area);
		
		// Circle 객체없이 원의 면적을 구하기
		area = Circle.getArea(radius);
		System.out.printf("[static] 반지름이 %.2f인 원의 넓이는 %.2f입니다.", c.getRadius(), area);
	}
}
