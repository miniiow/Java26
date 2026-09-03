package Chap5;

public class Example07 {
	public static void main(String[] args) {
		int[] a = {3,2,4,1,5};
		int[] b = {3,2,4,1};
		int[] c = {3,2,4,1,5};
		int[] d = {2,7,1,8,2};
		
		System.out.println(isSame(a, b));
		System.out.println(isSame(b, a));
		System.out.println(isSame(a, c));
		System.out.println(isSame(a, d));
	}
	
	public static boolean isSame(int[] aArr, int[]bArr) {
		if(aArr.length == bArr.length) {
			for(int i = 0 ; i < aArr.length ; i++) {
				if(aArr[i] != bArr[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
}
