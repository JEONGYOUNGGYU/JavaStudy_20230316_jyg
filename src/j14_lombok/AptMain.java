package j14_lombok;

public class AptMain {

	public static void main(String[] args) {
		Apt apt = Apt.builder().floor(40).height(160).width(50).build();
		
		System.out.println(apt);
		System.out.println(apt.getFloor());
		System.out.println(apt.getHeight());
		System.out.println(apt.getWidth());
		System.out.println(apt.getClass());
	}

}
