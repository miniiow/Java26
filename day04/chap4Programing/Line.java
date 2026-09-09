package chap4Programing;

public class Line {
	static int l;
	
	public Line(int l) {
		this.l = l;
	}
	
	public boolean isSameLine(Line a) {
		if(this.l == a.l) {
			return true;
		}
		else {
			return false;
		}
	}
}
