package j12_다형성.추상;

public class AnimalMain2 {
	
	public static void main(String[] args) {
		
		Animal2 animal2 = new Human2();		// 추상은 생성이 안되서 상속받고 있는 Human2로 받는다
		animal2.attack();
		((Human2)animal2).love();			// love()를 쓰고 싶으면 Human2로 다운캐스팅하여 사용
		
		
		
	}

}
