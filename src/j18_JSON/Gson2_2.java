package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2_2 {

	public static void main(String[] args) {
		
		//객체를 JSON으로 변환
		User2 user2 = UserService2.createUser2();
		
		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
					// Builder 써서 생성하는 이유 setPrettyPrinting을 쓰려고
		String userJson = gson2.toJson(user2);
		
		System.out.println(userJson);
	
		
		//JSON을 객체로 변환
		User2 user2Obj = gson2.fromJson(userJson, User2.class);
		System.out.println(user2Obj);
		System.out.println();
		
		
		//객체로 변환을 하면 값을 뽑아낼 수 있다
		System.out.println(user2Obj.getName());
		
	}

}
