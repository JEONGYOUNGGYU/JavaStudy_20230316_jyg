package j02_변수와상수;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		int num = 10;
		num = 20;
		
		System.out.println("최댓값 : " + MAX_NUMBER);
		System.out.println("최솟값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + num);
		
		
	}
}
