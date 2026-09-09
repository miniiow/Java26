package chap4Challenge;

public class PrinterTest {
	public static void main(String[] args) {
		// 도전과제 2-3
		Printer p = new Printer(10);
		p.print(2);
		p.print(20);
		p.print(10);
		
		System.out.println("------------------");
		
		// 도전과제 3-3
		Printer p2 = new Printer(20, true);
		p2.print(25);
		p2.setDuplex(false);
		p2.print(10);
	}
}


