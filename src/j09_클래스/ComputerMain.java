package j09_클래스;

public class ComputerMain {
	public static void main(String[] args) {

		System.out.println(new Computer()); // new 생성 -> 주소할당
		System.out.println(new Computer());
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		System.out.println(c1);
		
		c1.cpu = "i7"; // . -> 주소참조
		c1.company = "SAMSUNG";
		c1.ram = 8;
		c1.year = 2023;
		c1.graphic = "RTX3060";
		
		c2.cpu = "i5";
		c2.company = "LG";
		c2.ram = 16;
		c2.year = 2022;
		c2.graphic = "RTX1080";
		
		c1.addRam(8);
		c1.addRam(32);
		
		c1.removeRam(16);
		c1.removeRam(32);
		
		c1.showInfo();
		System.out.println();
		c2.showInfo();
		
	}
}
