package j14_lombok;


public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student(20230001, "홍길동", 3, 18);
		student.getAge();
		
		Student student2 = new Student(0, null, 0, 0);
		
//		Student student3 = new Student();
	}

}
