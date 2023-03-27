package j09_클래스.접근지정자.student;

public class Student {
	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	
	public Student() {
		
	}
	
	// private 변수에 값을 주입하는 방법1
	// [생성자를 통한 값 주입]

	
//	alt + shift + s 클릭 
	public Student(String name, int studentYear, int age, String address, String phone) {
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}