package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20230001, "홍길동");
		Student s2 = new Student(20230001, "홍길동");
		Student s3 = new Student(20230002, "홍길동2");
		Student s4 = new Student(20230002, "홍길동");
		
		System.out.println(s1 == s2);				// ==는 주소
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));			// equals는 문자열 비교
		System.out.println(s3.equals(s4));
		
	}

}
