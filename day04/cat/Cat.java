package cat;

public class Cat {
	// 필드(= 맴버변수, 인스턴스변수)
	String breed;
	String color;
	int age;
	
	// 디폴트 생성자(생성자를 만들지 않으면 JVM이 아래 형식으로 만들어줌)
	// 만약 생성자를 만든다면 디폴트생성자를 만들어 주지 않기 때문에 따로 생성해줘야함
	public Cat() {}
	
	public Cat(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	public Cat(String breed, String color) {
//		this.breed = breed;
//		this.color = color;
		this(breed, color, 0);
	}
	
	public Cat(String breed) {
//		this.breed = breed;
		this(breed, null, 0);
	}
	
	
	void eat(String time) {
		System.out.println(time + "에 사료를 먹습니다.");
	}
	
	void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}
	
	void meow() {
		System.out.println("야용~~~");
	}
	
	void setColor(String color) {
		this.color = color;
	}
}
