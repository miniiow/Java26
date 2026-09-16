package chap6Pro_05;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
		
		for(Phone p : phones) {
//			순서가 짱 중요하다... > Smartphone을 else if절에 넣었더니 Telephone에서 true로 빠져버림...;
			if(p instanceof Smartphone) {
				Smartphone sp = (Smartphone)p;
				sp.playGame();
			} else if(p instanceof Telephone) {
				Telephone tp = (Telephone)p;
				tp.autoAnswering();
				
			} else {
				p.talk();
			}
		}
	}
}
