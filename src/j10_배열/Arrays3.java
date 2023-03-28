package j10_배열;

public class Arrays3 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * names 배열 5개
		 * studentYears 배열 5개
		 * scores 배열 5개
		 * 
		 * 이가경 3 75.9
		 * 남지윤 2 80.5
		 * 정정빈 4 85.7
		 * 김상현 3 88.3
		 * 이태훈 4 78.5
		 * 
		 * 이가경 \t3학년 \t75.9점
		 * 남지윤 \t2학년 \t80.5점
		 * 정정빈 \t4학년 \t85.7점
		 * 김상현 \t3학년 \t88.3점
		 * 이태훈 \t4학년 \t78.5점
		 * 
		 * 
		 * 
		 */

		String[] names = {"이가경", "남지윤", "정정빈", "김상현", "이태훈"};
		int[] studentYears = {3, 2, 4, 3, 2};
		Double[] scores = {75.9, 80.5, 85.7, 88.3 , 78.5};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i] + "\t" + studentYears[i] + "학년" + "\t" + scores[i] + "점");
		}
		
		
		
	}

}
