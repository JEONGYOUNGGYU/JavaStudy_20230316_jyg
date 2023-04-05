package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
		/*
		 * genericTest 객체 만들고 number에 100, data에 200 넣고
		 */
//		GenericTest genericTest = new GenericTest();
//		genericTest.setNumber(100);
//		genericTest.setData("200");
//		System.out.println();
		
//		GenericTest<Integer> genericTest2 = new GenericTest();		
//		genericTest2.setNumber(100);
//		genericTest2.setData(200);
//		System.out.println(genericTest2.getNumber() + genericTest2.getData());
//	
//		GenericTest<String> genericTest3 = new GenericTest<>();
//		genericTest3.setNumber(100);
//		genericTest3.setData("200");
//		System.out.println(genericTest3.getNumber() + genericTest3.getData());
	
		GenericTest<String, String> genericTest4 = new GenericTest<>();
		genericTest4.setNumber("10");
		genericTest4.setData("20");
		System.out.println(genericTest4.getNumber() + genericTest4.getData());
		
	}

}
