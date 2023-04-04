package j12_다형성3;

public class CreatureMain {

	public static void main(String[] args) {
		Pigeon p = new Pigeon(3, 6, 2);
		p.printInfo();
		p.age();
		p.move(100);
		p.attack();
		p.flyMove(-4, -3);
		
		Kevin kevin = new Kevin(0, 0, 12);
		kevin.printInfo();
		
		kevin.age();
		kevin.swimDown(-9);
		kevin.swimDown(-9);
		kevin.printInfo();
		
	}	

}
