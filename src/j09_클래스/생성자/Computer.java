package j09_클래스.생성자;

public class Computer {
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	public Computer(int year, String company, String cpu, int ram, String graphic) {
		
		this.year = year;
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.graphic = graphic;
		
	}
	
	void showInfo() {
		
		System.out.println("year: " + year);
		System.out.println("company: " + company);
		System.out.println("cpu: " + cpu);
		System.out.println("ram: " + ram);
		System.out.println("graphic: " + graphic);
		
	}
}
