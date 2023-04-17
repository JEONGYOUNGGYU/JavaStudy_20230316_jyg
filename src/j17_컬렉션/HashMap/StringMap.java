package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		
		strMap.put(1, "java1");
		strMap.put(1, "java2");
		strMap.put(1, "java3");
		strMap.put(1, "java4");
		
		strMap.put(20, "java");
		strMap.put(30, "java");
		strMap.put(40, "java");
		strMap.put(50, "java");
		
		
		System.out.println(strMap);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}

//		Map은 forEach가 안됨
//		for(String value : strMap) {
//			
//		}
		
		System.out.println(strMap.containsKey(30));
		System.out.println(strMap.containsKey(35));
		
		System.out.println(strMap.containsValue("java"));
		System.out.println(strMap.containsValue("java2"));
	}
}
