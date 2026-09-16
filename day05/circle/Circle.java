package circle;

public class Circle {
	final static double PI = 3.14;
	protected double radius;	// 자식한테만 물려줌 > 다른 클래스에게는 private처럼 적용된다
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
