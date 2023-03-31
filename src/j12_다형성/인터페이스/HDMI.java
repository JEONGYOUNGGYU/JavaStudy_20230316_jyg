package j12_다형성.인터페이스;

/*
 * 인터페이스 특징
 * 1. 상속이라고 하지 않고 구현이라고 한다.
 * 2. 모든 메소드는 기본적으로 추상 메소드로 정의한다
 * 3. 생성을 할 수 없다.
 * 4. 일반 변수는 선언 할 수 없다.		Ex> public int num
 * 5. 무조건 스태틱 상수를 사용한다.		상수 = 변하지 않는 수
 * 6. 일반 메소드를 정의하기 위해서는 반환 자료형 앞에 default를 입력해야한다.
 * (public default void disConnect() {};) 
 * 7. 인터페이스는 다중 구현이 가능하다.
 */
public interface HDMI {
	
	public void connect();		// 추상이다. 왜? 중괄호가 없으니깐
	public void disConnect();
	
	public int num = 100;		// 초기화를 하면 상수이다.
	
}
