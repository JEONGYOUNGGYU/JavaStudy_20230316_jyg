package j15_스태틱;

public class Student {
	private static int autoCode = 20230000;
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autoCode;
		this.name = name;
	}

	
}
