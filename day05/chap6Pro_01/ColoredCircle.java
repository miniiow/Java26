package chap6Pro_01;

public class ColoredCircle extends Circle{
	String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}
}
