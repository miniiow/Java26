package chap4Programing;

public class GolfClub {
	int num;
	String club;
	
	
	public GolfClub(){}
	
	public GolfClub(int num) {
		this.num = num;
	}
	
	public GolfClub(String club) {
		this.club = club;
	}
	
	public void print() {
		if((club != null) && (num == 0)) {
			System.err.printf("퍼터입니다.");
		}
		else if((club == null) && (num != 0)){
			System.err.printf("%d번 %s입니다.\n", num, "아이언");
		}
		else {
			System.out.println("7번 아이언입니다.");
		}
	}
}
