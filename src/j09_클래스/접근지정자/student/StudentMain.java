package j09_클래스.접근지정자.student;

public class StudentMain {
	
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student("홍길동", 2, 18, "조선", "010-3300-4698");
		System.out.println(student2.getName());
		student2.setName("최연호");
		System.out.println(student2.getName());
		

	}

	
//	주소참조, 생성자, setName
}
