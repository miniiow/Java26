package chap4Programing;

public class Dice {
	public int roll() {
		int i = (int)(Math.random() * 6) + 1;
		
		return i; 
	}
}
