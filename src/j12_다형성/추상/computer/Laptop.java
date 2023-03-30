package j12_다형성.추상.computer;

public class Laptop extends Computer {

	@Override
	public void onKeyPress() {
		System.out.println("노트북에서 키보드 입력을 받습니다.");
		
	}

	@Override
	public void onDisplay() {
		System.out.println("노트북에서 화면을 출력합니다.");
		
	}
	
	@Override
	public void onSound() {
		System.out.println("노트북에서 ");
		super.onSound();
	}

}
