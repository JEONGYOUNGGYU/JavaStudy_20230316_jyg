package j12_다형성2;

public class MessengerMiddleware {						
	private Messenger messenger;

	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
	}
	
	public void receiveMessage() {
		messenger.receive();
	}
	
	public void runAddOns() {
		if(messenger instanceof FacebookMessenger) {
			((FacebookMessenger) messenger).call();
			
		}else if(messenger instanceof KakaoTalk) {
			((KakaoTalk) messenger).sendPresent();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
	}
	
}
