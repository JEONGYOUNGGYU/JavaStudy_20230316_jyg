package j12_다형성2;

public class KakaoTalk implements Messenger{		//카카오톡이 빨간줄 뜨는 이유 = Messenger에 추상메소드가 있기 때문, 그래서 오버라이드 해주면 된다

	@Override
	public void send() {
		System.out.println("카카오톡을 보냅니다");
		
	}
	@Override
	public void receive() {
		
		System.out.println("카카오톡을 받습니다");

	}
	public void sendPresent() {
		System.out.println("카카오톡으로 선물을 보냅니다.");
	}
	
}
