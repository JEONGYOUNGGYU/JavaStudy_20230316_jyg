package j15_스태틱.싱글톤2;

public class Volvo {
	
	private static Volvo instance;
	 
	public int autoCode;
	
	private Volvo() {
		Volvo[] volvos = new Volvo[10];
		autoCode = 20230000;
	}
	
	public static Volvo getinstance() {
		if(instance == null) {
			instance = new Volvo();
			return instance;
		}
		return instance;
	}
	
	
//	public boolean addCar(Truck truck) {
//		for(int i = 0; i < Volvo[])
//	}
	
}

