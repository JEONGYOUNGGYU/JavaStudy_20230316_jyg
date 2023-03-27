package j05_입력;

import java.util.Scanner;

public class input1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 변수는 초기값을 주는게 좋다.
		String name = null;
		String address = null; 
		int age = 0;
		
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();
		
		
		System.out.print("주소를 입력하세요 : ");
		address = scanner.nextLine();
		
		
		System.out.print("나이를 입력하세요 : ");
		age = scanner.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		
		
		

	}

}
