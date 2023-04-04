package j12_다형성3;

public class Kevin extends Human implements Swimable, Programmer{

	public Kevin(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void printInfo() {
		System.out.println("Kevin -> " + toString());
	}

	@Override
	public void swimDown(int yDistance) {
		setY(getY() + yDistance);
		System.out.println("너무 깊이 들어가면 죽을 수 있습니다");
	
		
	}

	@Override
	public void coding() {
		System.out.println("코딩을 합니다.");
	}
}
