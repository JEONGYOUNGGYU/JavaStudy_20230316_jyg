package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		
		Human human = new Human();		// 생성자 만들기, Human(); < 생성자 호출 Human()이 있는곳으로 감
		Tiger tiger = new Tiger();
//		
//		human.move();
//		tiger.move();
		
		human.readBooks();
		
		human.move();
	}

}
