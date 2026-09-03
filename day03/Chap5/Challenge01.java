package Chap5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Challenge01 {
	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		numOfStudents = sc.nextInt();
		scores = new int[numOfStudents];
		
		System.out.print("학생의 성적을 입력하세요 : ");
		for(int i = 0; i < numOfStudents ; i++) {
			scores[0] = sc.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int i = 0; i < scores.length ; i++) {
			System.out.print(scores[0] + " ");
		}
	}
}
