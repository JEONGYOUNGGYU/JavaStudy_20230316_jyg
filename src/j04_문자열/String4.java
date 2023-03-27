package j04_문자열;

public class String4 {

	public static void main(String[] args) {
		
		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		
//		010-3300-4698/010-1234-5678
		/*
		 * 
		 * 1. 010 -> 011
		 * 1-1 rephone 이라는 문자열 담기
		 * 2. / -> -
		 * 2-1 rephone2 라는 문자열에 담기
		 * 3. , -> /
		 * 3-1 rephone3 라는 문자열에 담기
		 * 4. rephone3 출력
		 * 
		 */
		
		String rephone = phoneNumbers.replaceAll("010", "011");
		rephone = rephone.replace('/', '-');
		rephone = rephone.replaceAll(", ", "/");
		System.out.println(rephone);
		
		int a = 10;
		a = 20;
		a = 30;
		System.out.println(a);
		
		String name = "최연호";
		String reName = name.replaceAll("연호","지수").replaceAll("최", "박");
		System.out.println(reName);
		
	
		
//		**내가 한 풀이
//		String replaceAdd = phoneNumbers.replaceAll(", ","/");
//		System.out.println(replaceAdd);
//		
//		int indexOf = phoneNumbers.indexOf("3");
//		System.out.println(indexOf);
//		
//		String replaceAdd2 = phoneNumbers.replaceAll("010", "011")
//							.replace('/', '-')
//							.replaceAll(", ", "/");
//		
//		System.out.println(replaceAdd2);
//		
//		System.out.println();
	}
}
