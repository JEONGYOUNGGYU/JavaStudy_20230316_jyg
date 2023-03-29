package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);		
		
		/*
		 * 실습
		 * 삼성배열 만들기(방은 3개)
		 * 1, 2, 3 삼성 공장을 배열에 각각 넣기
		 * 
		 * 엘지배열 만들기(방은 3개)
		 * 1, 2, 3 엘지 공장을 배열에 각각 넣기 
		 */
				
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);
		
		LGFactory[] lgFactories = new LGFactory[3];
		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);

		
		System.out.println("삼성 공장 가동");
		// 배열을 반복해서 삼성 1,2,3 공장 가동
		
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		
		System.out.println("삼성 공장 중지");
		// 배열을 반복해서 삼성 1,2,3 공장 중지
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].stop();
		}
		
		System.out.println("엘지 공장 가동");
		// 배열을 반복해서 엘지 1,2,3 공장 가동
		
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		
		System.out.println("엘지 공장 중지");
		// 배열을 반복해서 엘지 1,2,3 공장 중지
	
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
		
		
	}

}
