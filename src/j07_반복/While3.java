package j07_반복;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		/*
		 * 실습!
		 * 초기값 입력 : 3
		 * 반복횟수 입력 : 5
		 * 
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * 
		 * i = 7
		 * i = 6
		 * i = 5
		 * i = 4
		 * i = 3
		 */
		Scanner scanner = new Scanner(System.in);
		
		int fnum = 0;
		int loc = 0;
		int i = 0;
		
		
		System.out.print("초기값 입력 : ");
		fnum = scanner.nextInt();
		System.out.print("반복횟수 : ");
		loc = scanner.nextInt();
		
		while(i < loc) {
			System.out.println("i = " + (i + fnum));
			i++;
			
		}
		System.out.println();
		i = 0;
		while(i < loc){
			System.out.println("i = " + (fnum + loc -1));
			i++;
		}
	}
}

