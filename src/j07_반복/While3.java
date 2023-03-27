package j07_반복;

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
		 */
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("i = " + (i + 3));
			i++;
		}
	}
}
