package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	public static User createUser() {
		
		
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[]{"축구", "농구", "야구", "골프"}));
		
		User user = User.builder()
				.userCode(1)
				.username("gildong")
				.password("1234")
				.name(null)
				.email("gildong@gmail.com")
				.address("부산 진구")
				.phone("010-1234-5678")
				.hobby(null)
				.build();
		
		return user;	
	}

}

