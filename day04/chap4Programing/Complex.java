package chap4Programing;

public class Complex {
	static double rnum;
	static double inum;
	
	Complex(double rnum){
		this.rnum = rnum;
	}
	
	Complex(double rnum, double inum){
		this.rnum = rnum;
		this.inum = inum;
	}
	
	public void print() {
		if(inum == 0) {
			System.out.printf("%.1f + 0.0i\n", rnum);
		}
		else {
			System.out.printf("%.1f + %.1f\n", rnum, inum);
		}
	}
}
