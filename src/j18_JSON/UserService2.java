package j18_JSON;

public class UserService2 {
	public static User2 createUser2() {
		
		User2 user2 = User2.builder()
				.name("정영규")
				.id("yg")
				.password("1234")
				.email("yg@naver.com")
				.build();
		
		return user2;
				
	}
}
