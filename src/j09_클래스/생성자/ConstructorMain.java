package j09_클래스.생성자;

public class ConstructorMain {
	

	public static void main(String[] args) {

		ConstructorEx constructorEx = new ConstructorEx(); // 생성자 호출!
		ConstructorEx constructorEx2 = new ConstructorEx("홍길동");
		ConstructorEx constructorEx3 = new ConstructorEx(26);
		ConstructorEx constructorEx4 = new ConstructorEx("홍길동", 26);
		
	}
}
