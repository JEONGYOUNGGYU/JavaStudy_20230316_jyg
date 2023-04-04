package j12_다형성.추상.computer;

public abstract class Desktop extends Computer{

	@Override
	public void onKeyPress() {					// 오버라이드 하나만 있을 때 Desktop 빨간 줄
		System.out.println("컴퓨터의 키보드 입력을 받습니다.");
	}
	
	public abstract void onMouseClick();
	
	@Override
	public void onDisplay() {
		System.out.println("컴퓨터에서 ");
		super.onSound();
	}
	
}
