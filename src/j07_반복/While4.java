package j07_반복;

public class While4 {
	public static void main(String[] args) {
		// 구구단
		int dan = 2;
		int i = 0;

		while(i < 9) {
			int num = i + 1;
			System.out.println(dan + "x" + num + " = " + (dan * num));
			i++;
		}
		
		/*실습!
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * 2 x 4 = 8
		 * 2 x 5 = 10
		 * 2 x 6 = 12
		 * 2 x 7 = 14
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 */
		
	}

}
