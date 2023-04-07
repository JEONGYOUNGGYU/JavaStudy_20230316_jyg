package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Set;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("구민근");
		Student student3 = new Student("신동욱");
		Student student4 = new Student("윤미소");
		Student student5 = new Student("정영규");
		
		/*
		 *  실습!
		 *  배열(students)을 만들어서 학생 객체를 다 넣고
		 *  이 배열을 Set(studentSet)에다가 추가하고
		 *  Set을 반복을 돌려 신동욱을 찾아서 출력하고 삭제.
		 */
		
		Student[] students = new Student [5];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		System.out.println(students[0]);
		
	}

}
