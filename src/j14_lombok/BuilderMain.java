package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		
		/*
		 * Car 객체 "화이트", "k5", "기아"
		 */
		Car car = new Car("기아", "k5", "화이트");
		 
		Car car2 = builder.builder()
				   .color("화이트")
				   .model("k5")
				   .company("기아")
				   .build();
		
		System.out.println(car2.getColor());
		System.out.println(car2.getModel());
		
		
	}

}
