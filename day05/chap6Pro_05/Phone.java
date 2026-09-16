package chap6Pro_05;

public class Phone {
	protected String owner;
	
	public Phone() {}
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	void talk() {
		System.out.printf("%s가 통화중이다.\n", owner);
	}
}
