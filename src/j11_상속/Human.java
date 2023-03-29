package j11_상속;

public class Human extends Animal{
		//  자식클래스        부모클래스

	public Human() {		// 기본생성자 만들기 Ctrl + Space
		System.out.println("Human객체 생성");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override
	public void move() {
//		super.move();	// super는 부모
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	// 오버라이드 : 재정의
	// @ -> 어노테이션이라고 읽음.
	
}
