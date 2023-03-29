package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		
		Factory sf = samsungFactory; 

		sf.start();
		
		SamsungFactory ssf = (SamsungFactory) sf;
		ssf.start();
		
		Factory factory = new Factory(1);
//		LGFactory lgFactory = (LGFactory)factory;
//		lgFactory.start();
		
		System.out.println(samsungFactory);
		System.out.println(sf);
		System.out.println(factory);
		
		System.out.println(sf instanceof SamsungFactory);
	
	}

}
