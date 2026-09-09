package chap4Programing;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
