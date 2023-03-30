package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
	
		
		System.out.println(factories[0] instanceof SamsungFactory);	// instanceof = 원래 형태에 대해 묻는 것
		System.out.println(factories[0] instanceof LGFactory);		// 구문 해석 : factories[0]번째가 LGFactory이냐
		System.out.println();
		/*
		 * 팩토리 배열 반복 1번 돌리기 (for 1번)
		 * 삼성1공장을 가동합니다
		 * 삼성 스마트폰을 제작합니다.
		 * 삼성1공장을 중지합니다.
		 * 
		 * 엘지1공장을 가동합니다.
		 * LG 스마트TV를 제작합니다.
		 * 엘지1공장을 중지합니다.
		 * 
		 * 엘지2공장을 가동합니다.
		 * LG 스마트TV를 제작합니다.
		 * 엘지1공장을 중지합니다.
		 * 
		 * 엘지2공장을 가동합니다.
		 * LG 스마트TV를 제작합니다.
		 * 엘지1공장을 중지합니다.
		 */
	
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory)factories[i];
				samsungFactory.produceSmartPhone();				
			}else if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory)factories[i];
				lgFactory.produceSmartTV();
			}
			
			factories[i].stop();
			System.out.println();
		}
		
	
	}

}
