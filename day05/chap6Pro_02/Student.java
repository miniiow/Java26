package chap6Pro_02;

public class Student extends Person{
	int stuNum;
	
	public Student() {}
	
	public Student(String name, int age, int stuNum) {
		super(name, age);
		this.stuNum = stuNum;
	}
	
	@Override
	public void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, stuNum);
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

}
