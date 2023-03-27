package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		String names = "정정빈님, 이태훈님, 이상현님, 윤미소님";
		// StringBuilder를 사용하여 아래와 같이 출력이 되게 하시오.
		// 결과물 : 정정빈/이태훈/이상현/윤미소
		// 풀이1
//		stringBuilder.append(names.substring(0, 3));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(6, 9));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(12, 15));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(18, 21));
//		
//		System.out.println(stringBuilder);
//		
//		String name2 = "최연호님, 최연일님, 최연이님";
//		int index = name2.indexOf("님");
//		System.out.println(index);
//		
//		int index2 = name2.indexOf("님", 4);
//		System.out.println(index2);
//	
		
		// 풀이2
		int index = names.indexOf("님");
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		System.out.println(stringBuilder);
		
		index = names.indexOf("님", index + 1);
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		System.out.println(stringBuilder);
		
		index = names.indexOf("님", index + 1);
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		System.out.println(stringBuilder);
		
		index = names.indexOf("님",index + 1);
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index)); 
											// 18번째부터 21번째 앞 즉 20번째까 잘라라
		System.out.println(stringBuilder);
		System.out.println();
		
		
		
//		String reNames = names.replace('님', ' ').replaceAll(" , ", "/");
//		System.out.println(reNames);
//		
	
//		stringBuilder.append("정정빈/이태훈/이상현/윤미소");
//		System.out.println(stringBuilder);

	
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		System.out.println(stringBuilder2);
		
		int index2;
		index2 = stringBuilder2.indexOf("님");
		System.out.println(index2);
		stringBuilder2.delete(index2 , index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		System.out.println(index2);
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		System.out.println(index2);
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		System.out.println(index2);
		stringBuilder2.delete(index2, index2 + 3);
		
		
		//		작성
		
		
		System.out.println(stringBuilder2);
//		정정빈이태훈이상현윤미소
		
		
		
	}

}
