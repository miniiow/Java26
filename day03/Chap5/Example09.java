package Chap5;

public class Example09 {
	public static void main(String[] args) {
		minesweeper(5, 10, 0.3);
	}
	
	public static void minesweeper(int m, int n, double p) {
		String[][] field = new String[m][n];
		String[][] fieldCopy = new String[m][n];
		String star = "*";
		String safe = "-";
		int count = 0;
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if( p > Math.random()) {
					field[i][j] = star;
				}
				else {
					field[i][j] = safe;
				}
				System.out.print(field[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				count = 0;
				
				// 가장자리 제외 안쪽만
				if((i > 0) && (j > 0) && (j+1 < n) && (i+1 < m)) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i-1][j-1].equals(star)) count++;
						if(field[i-1][j].equals(star)) count++;
						if(field[i-1][j+1].equals(star)) count++;
						if(field[i][j-1].equals(star)) count++;
						if(field[i][j+1].equals(star)) count++;
						if(field[i+1][j-1].equals(star)) count++;
						if(field[i+1][j].equals(star)) count++;
						if(field[i+1][j+1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 좌측 상단 모서리
				else if((i == 0) && (j == 0)){
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i][j+1].equals(star)) count++;
						if(field[i+1][j].equals(star)) count++;
						if(field[i+1][j+1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 우측 상단 모서리
				else if((i == 0) && (j == n-1)) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i][j-1].equals(star)) count++;
						if(field[i+1][j-1].equals(star)) count++;
						if(field[i+1][j].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 좌측 하단 모서리
				else if((i == m-1) && (j == 0)) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i-1][j].equals(star)) count++;
						if(field[i-1][j+1].equals(star)) count++;
						if(field[i][j+1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 우측 하단 모서리
				else if((i == m-1) && (j == n-1)) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i-1][j-1].equals(star)) count++;
						if(field[i-1][j].equals(star)) count++;
						if(field[i][j-1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 첫행 안쪽
				else if(i == 0) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i][j-1].equals(star)) count++;
						if(field[i][j+1].equals(star)) count++;
						if(field[i+1][j-1].equals(star)) count++;
						if(field[i+1][j].equals(star)) count++;
						if(field[i+1][j+1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 마지막행 안쪽
				else if(i == m-1) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i-1][j-1].equals(star)) count++;
						if(field[i-1][j].equals(star)) count++;
						if(field[i-1][j+1].equals(star)) count++;
						if(field[i][j-1].equals(star)) count++;
						if(field[i][j+1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 첫열 안쪽
				else if(j == 0) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i-1][j].equals(star)) count++;
						if(field[i-1][j+1].equals(star)) count++;
						if(field[i][j+1].equals(star)) count++;
						if(field[i+1][j].equals(star)) count++;
						if(field[i+1][j+1].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				// 마지막열 안쪽
				else if(j == n-1) {
					if(field[i][j].equals(star)) {
						fieldCopy[i][j] = star;
					}
					else {
						if(field[i-1][j-1].equals(star)) count++;
						if(field[i-1][j].equals(star)) count++;
						if(field[i][j-1].equals(star)) count++;
						if(field[i+1][j-1].equals(star)) count++;
						if(field[i+1][j].equals(star)) count++;
						
						fieldCopy[i][j] = String.valueOf(count);
					}
				}
				System.out.print(fieldCopy[i][j] + " ");
			}
			System.out.println();
		}
	}
}
