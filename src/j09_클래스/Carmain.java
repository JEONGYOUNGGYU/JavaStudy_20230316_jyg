package j09_클래스;

public class Carmain {
public static void main(String[] args) {
		
		/*
		 * Car 클래스 만들기
		 * 변수
		 * 		company
		 * 		model
		 * 		color
		 * 
		 * 메소드
		 * showCarInfo();
		 * 		회사명 : 000
		 * 		모델명 : 000
		 * 		색상 : 000
		 * 
		 * ColorChange(1);
		 * 		1 -> 차색상이 red로 바뀜
		 * 		2 -> orange
		 * 		3 -> blue
		 * 
		 * * 메개변수 == 1 일때 red
		 * * 메개변수.equals(1)
		 * 
		 * 총 세대의 차량 만들기
		 * 현대
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아
		 * k5
		 * 블랙
		 * 
		 * 현대
		 * 아반떼
		 * 그레이
		 */
	
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블랙";
		
		car3.company = "현대";
		car3.model = "아반떼";
		car3.color = "그레이";
		
		car1.colorChange(2);
		car1.colorChange(3);
		car1.colorChange(5);
		
		car1.showCarInfo();
		System.out.println();
		car2.showCarInfo();
		System.out.println();
		car3.showCarInfo();
	}
}
