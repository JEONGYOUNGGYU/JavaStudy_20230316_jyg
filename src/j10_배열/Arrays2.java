package j10_배열;

public class Arrays2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 2;
		numbers[3] = 3;
		numbers[4] = 4;
		numbers[5] = 5;
		numbers[6] = 6;
		numbers[7] = 7;
		numbers[8] = 8;
		numbers[9] = 9;

		int[] numbers2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(numbers3[2]);
		
		/*
		 * 실습
		 * 1000개의 방이 있는 정수배열 numbers4 만들고
		 * 반복문을 통해 1 ~ 1000까지 값을 넣기
		 * 반복문을 통해 0번 인덱스방부터 999번 인덱스방까지 출력
		 */
		
		int[] numbers4 = new int[1000];
		
		for(int i = 0; i < 1000; i++){
			numbers4[i] = i + 1;
		}
		for(int i = 0; i < 1000; i++) {
			System.out.println(numbers4[i]);
		}
		
	}
}
