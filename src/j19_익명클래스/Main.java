package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTestImpl();
			
		abstractTest.showData("홍길동");
		abstractTest.add(10, 20);
		
		AbstractTest abstractTest2 = new AbstractTest() {
			
			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용가능한 data");
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("여기에서만 사용가능한 add");
			}
			
		};
		
		
	}

}


