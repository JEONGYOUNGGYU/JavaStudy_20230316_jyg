package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {
		
		Map<String, Object> datamap = new HashMap<String, Object>();

		datamap.put("count", 1118);
		datamap.put("next", 1);
		datamap.put("previous", null);
		
		System.out.println(datamap);
		
		Map<String, String> info = new HashMap<String, String>();
		
		info.put("name", "bulbasaur");
		info.put("url", "2");
		
		Map<String, String> info2 = new HashMap<String, String>();
				
		info2.put("name", "ivysaur");
		info2.put("url", "3");
				
		Map<String, String> info3 = new HashMap<String, String>();
				
		info3.put("name", "venusaur");
		info3.put("url", "4");
		
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		
		list.add(info);
		list.add(info2);
		list.add(info3);
		
		datamap.put("results", list);
		
		System.out.println(datamap);
		
	}

}
