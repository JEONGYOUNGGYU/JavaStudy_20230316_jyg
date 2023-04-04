package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {
		double rNum = Math.random();
//		System.out.println(rNum);
		System.out.println();
		
		
		int i = 0;
		while(i < 10) {
			double rNum2 = Math.random();
			System.out.println((int) (rNum2 * 100));
			i++;
		}
		
	/*
	 * 69
	 * 19
	 * 49
	 * 4
	 */

	}
}

