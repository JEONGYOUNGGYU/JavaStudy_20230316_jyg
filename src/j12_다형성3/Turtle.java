package j12_다형성3;

public class Turtle extends Animal implements Swimable{

	public Turtle(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void printInfo() {			//creature에 있는건가?
	System.out.println("Turtle -> ; " + toString());	
	}
	
	@Override
	public void swimDown(int yDistance) {
		setY(getY() + yDistance);
	}


}