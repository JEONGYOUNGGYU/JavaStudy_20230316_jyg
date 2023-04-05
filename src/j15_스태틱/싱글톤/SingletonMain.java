package j15_스태틱.싱글톤;

public class SingletonMain {
	
	public static void main(String[] args) {
	
		KIA kia = KIA.getInstance();
		kia.produceCar("k3");
	
		System.out.println(kia.produceCar("k3"));
	}
}
