package j15_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * 학생 열명 들어가는 배열 만들기
		 * 배열안에
		 * 홍길동1
		 * 홍길동2
		 * ...
		 * 홍길동10 넣기
		 * 
		 * 반복문을 통해
		 * 배열객체 출력(출력은 변수의 값들이 나올 것)
		 */
		
		Student[] students = new Student[10];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student("홍길동" + (i + 1));
		}
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

}
