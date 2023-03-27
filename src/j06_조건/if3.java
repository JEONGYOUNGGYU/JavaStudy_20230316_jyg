package j06_조건;

import java.util.Scanner;

public class if3 {

	public static void main(String[] args) {
		/*
		 * x값을 입력하세요 : 10
		 * y값을 입력하세요 : 2
		 * 
		 * 
		 * x: 10
		 * y: 2
		 * 결과 : 1사분면
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		String result = null;
		
		
		System.out.print("x값을 입력하세요 : ");
		x = scanner.nextInt();
		
		System.out.print("y값을 입력하세요 : ");
		y = scanner.nextInt();
		
		if(x > 0 && y > 0) {
			result = "1사분면";
		}else if(x < 0 && y > 0){
			result = "2사분면";
		}else if(x < 0 && y > 0) {
			result = "3사분면";
		}else{
			result = "4사분면";
		}
		
		System.out.println("결과 : " + result);
		
	}

}
