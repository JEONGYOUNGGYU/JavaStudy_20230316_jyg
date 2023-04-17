package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		// Gson 객체 생성하는 방법
		
		//1) Gson() 생성자를 통해 생성
		Gson gson1 = new Gson();
		
		//2) GsonBuilder() 생성자를 통해 생성
		Gson gson2 = new GsonBuilder().create();
		
		// JSON 출력
		Gson gson3 = new GsonBuilder().create();
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "gildong");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("email", "hong@gmail.com");
		
		String json1 = gson3.toJson(map);
		System.out.println(json1);
		
		String json2 = gson1.toJson(map);
		System.out.println(json2);
	}

}
