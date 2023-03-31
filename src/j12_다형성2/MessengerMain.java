package j12_다형성2;

public class MessengerMain {

	public static void main(String[] args) {
		KakaoTalk kakaoTalk = new KakaoTalk();
		FacebookMessenger facebookMessenger = new FacebookMessenger();
		
		Messenger messenger = facebookMessenger;
		
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(messenger);
		
		messengerMiddleware.sendMessage();
		System.out.println("메시지 전송완료");
		
		messengerMiddleware.receiveMessage();
		System.out.println("메세지 수신 완료");
		
		messengerMiddleware.runAddOns();
	}

}
