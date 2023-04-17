package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		/*
		 * 축구 -> soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf
		 * q입 시 프로그램 종료 
		 */

		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("입력해보세요 : ");
//			soccer = sc.nextLine();
//			System.out.println(soccer + " -> soccer");
//			baseball = sc.nextLine();
//			System.out.println(baseball + " -> baseball");
//			basketball = sc.nextLine();
//			System.out.println(basketball + " -> basketball");
//			golf = sc.nextLine();
//			System.out.println(golf + " -> golf");
//			
//		}
		
		while(true) {
			String searchText = null;
			
			System.out.println("[사전검색기능]");
			System.out.println("#프로그램종료(q)");
			
			System.out.print("검색어 : ");
			searchText = sc.nextLine();
			
			if(searchText.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else if(searchText.equals("축구")) {
				System.out.print("축구 -> soccer");
			}else if(searchText.equals("야구")) {
				System.out.print("야구 -> baseball");
			}else if(searchText.equals("농구")) {
				System.out.print("농구 -> basketball");
			}else if(searchText.equals("골프")) {
				System.out.print("골프 -> golf");
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}
			
			System.out.println();
		}
	
	}

}
