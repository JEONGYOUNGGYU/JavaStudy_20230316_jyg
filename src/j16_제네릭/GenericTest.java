package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<T, E> {
	// <T> : 자료형을 생성할 때 만들어주겠다
	// T,E를 꼭 안써도 되고 K도 써도 된다
	// E는 객체를 잡고 T는 나머지
	private T data;
	private E number;
	
}
