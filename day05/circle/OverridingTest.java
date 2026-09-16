package circle;

public class OverridingTest {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println(">>> 원 : ");
		printCircleInfo(circle);
		printCircleInfo(new Circle(5.0));
		
		Circle b = new Ball(5.0);
		System.out.println(">>> 구(Ball) : ");
		printCircleInfo(b);
		
		Circle cyl = new Cylinder(5.0, 7.0);
		System.out.println(">>> 원기둥(Cylinder) : ");
		printCircleInfo(cyl);
		Cylinder cyl2 = (Cylinder)cyl;
		System.out.println("높이 : " + cyl2.getHeight());
	}
	
	public static void printCircleInfo(Circle c) {
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
	}
}
