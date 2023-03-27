package j09_클래스.생성자;

public class ConstructorEx2 {
	String name;
	int birth;
	
	public ConstructorEx2() {

	}
	
	public ConstructorEx2(String name) {
		this.name = name;
	}
	
	public ConstructorEx2(int birth) {
		this.birth = birth;
	}

	public ConstructorEx2(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}

	void showInfo() {
		
		System.out.println("이름: " + name);
		System.out.println("생일: " + birth);
		
	}
}
