package j06_조건;

public class SwitchCase2 {

	public static void main(String[] args) {
		int score = 87;
		switch (score / 10) {
			case 10:
				System.out.println("만점입니다.");
				break;
			case 9:
				System.out.println("90점대 입니다.");
				break;
			case 8:
				System.out.println("80점대 입니다.");
				break;
			case 7:
				System.out.println("70점대 입니다.");
				break;
			case 6:
				System.out.println("60점대 입니다.");
		}
		
		
	}

}
