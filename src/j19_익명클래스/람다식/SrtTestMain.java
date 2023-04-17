package j19_익명클래스.람다식;

public class SrtTestMain {

	public static void main(String[] args) {
		/*
		 * 어제 배운 람다식을 활용하여
		 * 인터페이스에 test라는 메소드 만들고
		 *
		 * 매개변수로 문자열을 던져주면
		 * 문자열 + "님" 이 리턴되도록하는 람다식 작성
		 * 
		 */
		
//		StrTest strTest = new StrTest() {
//			
//			@Override
//			public String test(String str) {
//				
//				return str + "님";
//			}
//		};
//		
//		System.out.println(strTest.test("홍길동"));
		
		StrTest strTest2 = str -> str + "님";
		
		System.out.println(strTest2.test("홍길동"));
	}
}
