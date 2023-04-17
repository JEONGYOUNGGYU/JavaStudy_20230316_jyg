package j17_컬렉션.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		
		Student[] students = {student1, student2, student3, student4, student5};
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.addAll(Arrays.asList(students));
		
		System.out.println(studentSet);
		System.out.println();
		
//		Iterator<Student> ir = studentSet.iterator();
//		while(ir.hasNext()) {
//			Student student = ir.next();
//			if(student.getName().equals("신동욱")) {
//				System.out.println(student);
//				ir.remove();
//				
//			}
//		}
//		System.out.println(studentSet);
		for(Student student : studentSet) {
			if(student.getName().equals("신동욱")) {
				System.out.println(student);
				studentSet.remove(student);
				break;
			}
			
		}
		
		System.out.println(studentSet);
		
	}

}
