package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
//		업캐스팅(묵시적 형변환)
		char a = 'A';
		int b = a;
		
		double c = b;
		double k = a;
		System.out.println(k);
		
		
		System.out.println(b);
		System.out.println(c);
		
		
//		다운캐스팅(명시적 형변환)
		int d = (int)c;
		char e = (char)d;
		
		System.out.println(d);
		System.out.println(e);
		
	}

}
