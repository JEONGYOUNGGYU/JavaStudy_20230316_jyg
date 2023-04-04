package j06_조건;

public class SwithCase {

	public static void main(String[] args) {
		
		switch(30) {
			case 10:
				System.out.println("10입니다");
			case 20:
				System.out.println("20입니다");
			case 30:
				System.out.println("30입니다");
			case 40:
				System.out.println("40입니다");
			case 50:
				System.out.println("50입니다");
			case 60:
				System.out.println("60입니다");
		}
		
		switch("나") {
		case "가":
			System.out.println("가입니다");
		case "나":
			System.out.println("나입니다");
		case "다":
			System.out.println("다입니다");
		case "라":
			System.out.println("라입니다");
			break;
		case "마":
			System.out.println("마입니다");
		case "바":
			System.out.println("바입니다");
		default:
			System.out.println("홍길동입니다.");
	}

		System.out.println("switch-case 밖입니다.");
		
	}

}

