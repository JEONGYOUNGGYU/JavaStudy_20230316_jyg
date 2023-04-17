package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		Math<Integer,Integer> plusMath = new Math<Integer, Integer>() {

			@Override
			public double calc(Integer value, Integer value2) {
			
				return value + value2;
			}

		};
		System.out.println(plusMath.calc(10, 20));
	
		Math<Double, Double> plusMath2 = (v1, v2) -> v1 + v2;
									//    매개변수/ 함수 :calc을 의미 / 리턴값
		System.out.println(plusMath2.calc(10.5, 20.5));
	
		
		Math<Double, Double> plusMath3 = (v1, v2) -> {
			System.out.println("v1 : " + v1);
			System.out.println("v2 : " + v2);
			return v1 + v2;
		};
		
		System.out.println(plusMath3.calc(100.5, 100.5));
		}
	
}
