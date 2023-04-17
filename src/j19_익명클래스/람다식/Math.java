package j19_익명클래스.람다식;

@FunctionalInterface // 람다형이다라는 뜻, 람다는 메소드 하나만 사용가능, 인터페이스에만 사용가능!
public interface Math<T1, T2> {
	
	public double calc(T1 value, T2 value2);
	
//	public double calc2(T1 value, T2 value2);
	
	
}
