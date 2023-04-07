package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");	//중복허용x
		set.add("java");
		set.add("java");
		set.add("java");
		
		set.add("python");	
		set.add("python");
		set.add("python");
		set.add("python");
		
		set.add("1");
		set.add("2");
		
		
		
		System.out.println(set);	// 지금은 순서가 없다고 생각
		
		
		Iterator<String> ir = set.iterator();
		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		zxSystem.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
		
		/*
		 * 반복문을 돌려 만약 요소값이 java이면
		 * 그 요소값을 출력
		 */
		
		
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("java")) {
				System.out.println(str);
			}
		}
		
		
		
		
//		for(int i = 0; i < ir.hasNext; i++) {
//			String str = ir.next();
//			if(str.equals("java")) {
//				System.out.println(str);
//			}
//			
//		}
		
	}

}
