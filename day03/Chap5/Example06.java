package Chap5;

public class Example06 {
	public static void main(String[] args) {
		int[] numbers = new int[] {52,37,79,95,14,17,33,-1,30,50};
		
		reverse(numbers);
		
		for(int i = 0; i<numbers.length ; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static int[] reverse(int[] numArr) {
		int temp = 0;
		int j = numArr.length - 1;
		
		for(int i = 0; i < numArr.length/2 ; i++) {
			temp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = temp;
			j--;
		}
		
		return numArr;
	}
}
