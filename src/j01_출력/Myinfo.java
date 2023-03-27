package j01_출력;

public class Myinfo {
	public static void main(String[] args) {
		// ctrl + space => 자동완성
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		String name4 = "홍길동";
		
		int age = 18;
		String address = "부산 진구 코리아아이티";
		
		
		System.out.println(""+ name1 + name2 + name3);		
		System.out.println(name1 + name2 + name3 + "");		
		System.out.println(name4);
		
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		
	}
}
