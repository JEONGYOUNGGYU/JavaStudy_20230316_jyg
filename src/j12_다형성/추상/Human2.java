package j12_다형성.추상;

public class Human2 extends Animal2 {

	@Override
	public void run() {
		System.out.println("사람이 열심히 달립니다.");		
		
	}
	
	@Override
	public void attack() {
		System.out.println("공격합니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("밥을 먹습니다.");
		
	}
	
	public void love() {
		System.out.println("인간이 사랑을 나눕니다.");
	}
}
