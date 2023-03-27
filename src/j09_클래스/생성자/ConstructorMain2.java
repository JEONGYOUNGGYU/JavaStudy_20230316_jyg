package j09_클래스.생성자;

public class ConstructorMain2 {
	public static void main(String[] args) {

		ConstructorEx2 constructorEx2 = new ConstructorEx2();
		ConstructorEx2 constructorEx22 = new ConstructorEx2("홍길동");
		ConstructorEx2 constructorEx23 = new ConstructorEx2(1014);
		ConstructorEx2 constructorEx24 = new ConstructorEx2("홍길동", 1014);
		
		constructorEx24.showInfo();
		System.out.println();
		constructorEx22.showInfo();
		System.out.println();
		constructorEx23.showInfo();
		
	}
	
	/*
	 * 기본 생성자는 생략이 가능하다.
	 * 생성자를 오버로딩하고 기본생성자를 생략하면 비활성화가 된다.
	 * 기본생성자를 사용하려면 꼭 작성해줘야한다.
	 */
}
