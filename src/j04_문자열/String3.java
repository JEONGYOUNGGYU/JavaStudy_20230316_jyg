package j04_문자열;

public class String3 {

	public static void main(String[] args) {
		String address = "부산시 진구 가야동";
		int index = address.indexOf("시");
		System.out.println(index);
	
		String address2 = "부산시 동래구 사직동";
		int index2 = address2.indexOf("동");
		System.out.println(index2);
	
		int index3 = address.lastIndexOf("동");
		System.out.println(index3);
		
		String subAddress = address2.substring(0,3);	// 0부터 3전까지
		System.out.println(subAddress);
	
		String subAddress2 = address2.substring(0, 10);
		System.out.println(subAddress2);
		
		/*
		 * 실습!
		 *  "부산광역시 서구 부민동"에서 indexOf, lastIndexOf를
		 *  사용해서 "부산광역시 서구"까지 출력 
		 */

		String address5 = "부산광역시 서구 부민동";
		int index5 = address5.indexOf("부");
		int index6 = address5.lastIndexOf("부");
		System.out.println(index5);
		System.out.println(index6);
		System.out.println(address5.substring(index5, index6 - 1));
			
		String subAddress3 = address5.substring(0, 8);
		System.out.println(subAddress3);

		
		// 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address5.replace(' ', '-');	
		System.out.println(replaceAddress);
		
		String replaceAddress2 = address5.replaceAll("서", "동래");
		System.out.println(replaceAddress2);
		
		
		/*
		 * indexOf란 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌.
		 * substring이란 해당 문자열에서 범위를 지정하여 문자열을 잘라줌.
		 * 
		 * replace -> 구문자를 신문자로 바꿈.
		 * replaceAll -> 구문자열을 신문자열로 바꿈.
		 * 
		 */
	}
}
