package j09_클래스.생성자;

public class ComputerMain2 {
	/*
	 * Computer 클래스 만들고
	 * 
	 * 	int year;
		String company;
		String cpu;
		int ram;
		String graphic;
		
	 * 해당 변수를 작성하고
	 * 
	 * 2022
	 * Apple
	 * i7
	 * 16
	 * RTX3060
	 */
	
	public static void main(String[] args) {
		
		Computer computer = new Computer(2022, "Apple", "i7", 16, "RTX3060");
		
		computer.showInfo();
		
	}

}
