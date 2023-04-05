package j15_스태틱.싱글톤2;

public class Volvo {
	
	private static Volvo instance;
	 
	public int autoCode;
	
	public static Volvo() {
		Volvo[] volvos = new Volvo[10];
		autoCode = 20230000;
	}
}

