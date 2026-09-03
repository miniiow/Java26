package Chap5;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("URL을 입력하세요 : ");
			String url = sc.nextLine();
			
			if(url.equals("bye")) {
				break;
			}
			
			if(url.substring(url.length() - 3, url.length()).equals("com")) {
				System.out.println(url + "은 'com'으로 끝납니다.");
			}
			
			if(url.substring(4, url.length() - 4).equals("java")) {
				System.out.println(url + "은 'java'를 포함합니다.");
			}
			
		}

	}
}
