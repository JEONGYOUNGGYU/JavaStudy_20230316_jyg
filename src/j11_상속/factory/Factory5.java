package j11_상속.factory;

public class Factory5 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * 팩토리 배열 만들기 (방은 20개)
		 * 
		 * 반복문을 통해
		 * 팩토리 배열의 인덱스번호가 짝수이면 삼성팩토리를 생성해서 대입
		 * 팩토리 배열의 인덱스번호가 홀수이면 엘지팩토리를 생성해서 대입
		 * 
		 * 삼성공장1~10
		 * 엘지공장1~10
		 * 
		 * 배열을 반복돌려
		 * 가동
		 * 제작
		 * 중지
		 */
		
		Factory[] factories = new Factory[20];
		
		
		for(int i = 0; i < factories.length; i++) {
			if(i % 2 != 1 || i % 2 != 0) {
				if(i < 10) {
					factories[i] = new SamsungFactory(i + 1);
					factories[i].start();
					SamsungFactory samsungFactory = (SamsungFactory) factories[i];
					samsungFactory.produceSmartPhone();
					factories[i].stop();
					
				}
			}
		}
		for(int i = 0; i< factories.length; i++) {
			if(i % 2 != 1 || i % 2 != 0) {
				if(i < 10) {
					factories[i] = new LGFactory(i + 1);
					factories[i].start();
					LGFactory lgFactory = (LGFactory) factories[i];
					lgFactory.produceSmartTV();
					factories[i].stop();
				}
					
			}
		}

	}

}
