package j10_배열;

import j09_클래스.Car;

public class Arrays4 {

	public static void main(String[] args) {
		/*
		 * Car 배열 5개
		 * 
		 * 카 객체 3개 만들기
		 * car1 : 현대 	그랜져 	오렌지
		 * car2 : 르노 	sm5 	핑크
		 * car3 : 테슬라 model3	레드
		 * 
		 * 0번 방에 car1 대입
		 * 1번 방에 car2 대입
		 * 3번 방에 car3 대입
		 * 
		 * 반복문을 돌려서
		 * 회사명 : 현대
		 * 모델명 : 그랜져
		 * 색상 : 오렌지
		 * 
		 * 회사명 : 르노
		 * 모델명 : sm5
		 * 색상 : 핑크 
		 * 
		 * 회사명 : 테슬라
		 * 모델명 : model3
		 * 색상 : 레드
		 * 
		 * 
		 */
		
		// 1. 카배열 만들기(주차장)
		Car[] cars = new Car[5];
		
		// 2. 차 3대 생성
		Car car1 = new Car("현대", "그랜져", "오렌지"); 
		Car car2 = new Car("르노", "sm5", "핑크");
		Car car3 = new Car("테슬라", "model3", "레드");
		
		// 3. 카배열에 카객체 넣기
		cars[0] = car1;		//객체를 쓰는 이유는 따로 들고오지 않아도 되기 때문 
		cars[1] = car2;
		cars[3] = car3;
		
		// 4. 반복문을 돌려 원하는 값을 get으로 뽑아내기
		for(int i = 0; i < cars.length; i++) {
			if(cars[i] == null) {		//만약 cars[i]가 null일 경우 
				continue; 				//처음으로 돌아가고 아니면 밑에 실행
			}
				System.out.println("회사명 : " + cars[i].getCompany() + "\n" + "모델명 : "+ cars[i].getModel() + "\n" + "색상 : "+ cars[i].getColor());				
		}
	}

}
