package chap6Pro_05;

public class Smartphone extends Telephone {
	private String game;
	
	public Smartphone() {}
	
	public Smartphone(String owner, String game) {
		this.owner = owner;
		this.game = game;
	}
	
	void playGame() {
		System.out.printf("%s가 %s 게임을 하는 중이다.\n", owner, game);
	}
}
