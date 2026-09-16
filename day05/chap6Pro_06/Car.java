package chap6Pro_06;

public class Car extends Vehicle{
	int displacement;
	int gears;
	
	public Car() {}
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override
	void show() {
		System.out.printf("자동차 색상 : %s, 자동차 속도 : %d, 자동차배기량 : %d, 자동차 기어 단수 : %d\n", color, speed, displacement, gears);
	}
}
