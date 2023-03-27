package j07_반복;

public class While2 {
	public static void main(String[] args) {
		/*
		 * 실습!
		 * 아래와 같이 출력되게 while문으로 작성하시오
		 * 홍길동3
		 * 홍길동4
		 * 홍길동5
		 * 홍길동6
		 * 홍길동7
		 */
		
		int i = 0;
		while(i < 5) {
			System.out.println("홍길동" + (i + 3));
			i++;
		}
	}
	
}
