package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		int k = 500;
		System.out.println(k < 1000 ? "1" : "0");
		String t = k < 1000 ? "1" : "0";
		System.out.println(t);
		
		/*
		 * 윤년
		 * : 해당 년도가 4의 배수이고 100의 배수가 아니거나
		 * 	400의 배수일 때
		 * 
		 * 
		 * 
		 */
		
		int year = 2024;
		String result = year % 4 == 0 
				&& (year % 100 != 0 || year % 400 == 0) ? "윤년" 
				: "윤년아님";
		System.out.println(result);
		
		System.out.println();
		int tt = 500;
		System.out.println(tt > 2000 ? "2000보다 큼" 
							: tt > 1000 ? "1000보다 큼" 
							: tt > 500 ? "500보다큼" 
							:  "500이하");
		
		
		
		
	}

}
