package j09_클래스;

public class Car {
	
	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("생성자 호출!!");
	}
	
	/*
	 * 생성자의 특징!
	 * 
	 * 1. 생성자는 무조건 주소값을 리턴한다.
	 * 2. 생성자는 무조건 클래스의 이름이 동일하다.(해야한다.)
	 */
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색 상: " + color);
	}
	
	void colorChange(Integer num) {
		if(num.equals(1)) {
			color = "red";
		}else if(num.equals(2)) {
			color = "orange";
		}else if(num.equals(3)) {
			color = "blue";
		}else {
			System.out.println("지원하지않는 색상정보입니다.");
		}
	}
}
