package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		/*
		 * 1교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 2교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 3교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 4교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * *while을 3번 쓰지 말기 (2번만 써보기)
		 */
		
//		int i = 0;
//		
//		while(i < 4) {
//			i = i + 1;
//			System.out.println(i + "교시");
//		
//			int j = 0;
//			while(j < 50) {
//				j = j + 1;
//				System.out.println("\t" + j + "분");
//			
//			
//			}System.out.println("\t10분 쉬는시간");
//			int k = 0;
//			while(k < 10) {
//				k = k + 1;
//				System.out.println("\t" + k + "분");
//			}
//		}
//	
		int i = 0;
		
		
		while(i < 4) {
			System.out.println((i + 1) + "교시");
			
			int j = 0;
			while(j < 60) {
				if(j < 50) {
					System.out.println("\t" + (j + 1) + "분");
				}else {
					if(j == 50) {
						System.out.println("\t10분 쉬는시간");
					}
					System.out.println("\t" + (j + 1 - 50) + "분");
				}
				j++;
			}
			i++;		
		}
		
	}

}
