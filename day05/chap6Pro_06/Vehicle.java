package chap6Pro_06;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle() {}
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.printf("자동차 색상 : %s, 자동차 속도 : %d\n", color, speed);
	}
}
