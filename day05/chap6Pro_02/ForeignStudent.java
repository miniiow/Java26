package chap6Pro_02;

public class ForeignStudent extends Student{
	String foreign;
	
	public ForeignStudent() {}
	
	public ForeignStudent(String name, int age, int stuNum, String foreign) {
		super(name, age, stuNum);
		this.foreign = foreign;
	}
	
	@Override
	public void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, stuNum, foreign);
	}
}
