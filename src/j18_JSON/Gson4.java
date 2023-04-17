package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("phone", "010-3300-4698");
		jsonObject.addProperty("home", true);
		jsonObject.addProperty("age", 18);
		
		String json = gson.toJson(jsonObject);
		System.out.println(json);
		
		JsonObject jsonObj = gson.fromJson(json, JsonObject.class);
		System.out.println(jsonObj);
		
	}

}
