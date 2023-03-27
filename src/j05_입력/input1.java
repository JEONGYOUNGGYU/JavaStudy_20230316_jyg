package j05_입력;

import java.util.Scanner;

public class input1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String str = scanner.next();
		
		System.out.println("출력 : " + str);
		
		
		String str2 = scanner.next();
		int num = scanner.nextInt();
		
		
		System.out.println(str);
		System.out.println(num);
	
	}
	
}
