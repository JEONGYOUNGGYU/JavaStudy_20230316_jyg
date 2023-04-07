package j17_컬렉션.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import lombok.Getter;

public class StringList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		
		list.add("html");
		list.add("java");
		
		//원하는 위치에 값 추가
		list.add(1, "css");
		
		//리스트의 toString()
		System.out.println(list);
		
		//리스트의 크기
		System.out.println("list 크기 : " + list.size());
		
		//리스트에서 해당 인덱스로 값 찾기
		String subject = list.get(0);
		System.out.println("0번 인덱스의 값 : " + subject);
		
		//리스트에서 인덱스 찾는 방법
		int findIndex = list.indexOf("python");
		System.out.println("python이 있는 위치 : " + findIndex);
		
		int findIndex2 = list.indexOf("java");
		System.out.println("java가 있는 위치 : " + findIndex2);
	
		// 해당 인덱스 위치에 값을 수정
		list.set(0, "c++");
		System.out.println(list);
		
		// 해당 리스트가 값을 포함하고 있는지 확인
		/*
		 * tempList 만들고 python, c++ 추가
		 * 
		 */
		ArrayList<String> templist = new ArrayList<String>();
		templist.add("python");
		templist.add("c++");
		templist.add("spring");
		
		boolean contains = list.contains("java");
		System.out.println("contains : " + contains);
		
		boolean contains2 = templist.contains("jsp");
		System.out.println("contains : " + contains2);
		
		boolean containsAll = list.containsAll(templist);
		System.out.println("containsAll : " + containsAll);
		
		System.out.println();
		// 다른 컬렉션의 데이터를 모두 추가
		list.addAll(templist);
		System.out.println(list);
		
		list.addAll(2, templist);
		System.out.println(list);
		
		// 삭제
		System.out.println(list.remove("python")); 
		System.out.println();
		System.out.println(list);
		
		
		while(list.contains("python")) {
			list.remove("python");
		}
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		// templist에 있는 것들만 제거
		list.removeAll(templist);
		System.out.println(list);
		list.add("python");
		list.add("c++");
		list.add("spring");
		
		System.out.println(list);
		
		list.retainAll(templist);	//removeAll의 반대 
		System.out.println(list);
		
		//리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		list.removeAll(templist);
		System.out.println(list.isEmpty());
		
		list.addAll(templist);
		System.out.println(list);
		
		//리스트 전체 비우기
		list.clear();
		System.out.println(list);
		
		Arrays.asList(new String[] {"java", "python", "c++", "html"});
		
		List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"});
		System.out.println(asList);
		System.out.println();
		
		list.addAll(asList);
		System.out.println(asList);
		
		/*
		 * 반복문을 통해 list안에 값들을 하나씩 출력
		 */
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		//foreach
		System.out.println("<<<foreach>>>");
		for(String str : list) {
			System.out.println(str);
		
		}
		//실습!
		String roles = "USER,ADMIN,TEST_USER";
		//쉼표로 구분해서 roleArray라는 배열에 넣기
		//배열을 리스트로 만들고 리스트를 반복돌려 하나씩 출력
		
		String[] roleArray = new String[3];
		int a = roles.indexOf(",");
		roleArray[0] = roles.substring(0, a);
		int b = roles.indexOf(",", a + 1 );
		roleArray[1] = roles.substring(a + 1, b);
		roleArray[2] = roles.substring(b + 1, roles.length());
		
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
		
		List<String> list3 = Arrays.asList(roleArray);
		for(int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		System.out.println();
		for(String str : list3) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("<<<<roles2>>>>");
		String roles2 = "USER,ADMIN,TEST_USER";
		
		String[] roleArray2 = roles2.split(",");
		System.out.println(roleArray2[0]);
		System.out.println(roleArray2[1]);
		System.out.println(roleArray2[2]);
		
		System.out.println();
		Arrays.asList(roleArray2).forEach(arg -> {
			System.out.println("role: " + arg);
		});
		
		
	}
}
