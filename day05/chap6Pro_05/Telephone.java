package chap6Pro_05;

public class Telephone extends Phone {
	private String when;
	
	public Telephone() {}
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	public String getWhen() {
		return when;
	}
	
	void autoAnswering() {
		System.out.printf("%s가 없다. %s 전화 줄래.\n", owner, when);
	}
}
