package j19_익명클래스.람다식;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DefaultFunction {

	public static void main(String[] args) {
		
		// Runnable
		Runnable runnable = () -> {
			System.out.println("runnale인터페이스를 활용한 람다식");
			System.out.println("중괄호 안에 여러 실행문을 작성할 수 있음");
		};
		runnable.run();
		
		Supplier<Integer> supplier = () -> 100;
		Supplier<Integer> supplier2 = () -> {
			System.out.println("다른 실행문도 가능");
			return 200; 
		};
		
		
		System.out.println(supplier.get());
		System.out.println(supplier2.get());

		
		// Consumer
		Consumer<String> consumer = (name) -> {
			System.out.println("이름 : " + name);
		};
		
		consumer.accept("홍길동");
		
		Consumer<Integer> consumer2 = (year) -> {
			System.out.println("나이 : " + year);
		};
		consumer2.accept(18);
		
		
		//Function
		Function<Integer, Integer> function = (num) -> num * num;
		
		System.out.println(function.apply(10));
		
		Function<String, String> function2 = (name) -> name + name;
		
		System.out.println(function2.apply("홍길동"));
		
		
		//Predicate
		Predicate<String> predicate = (str) -> !(str == null || str.isBlank());
		
		System.out.println(predicate.test("홍길동"));
		System.out.println(predicate.test(null));
		System.out.println(predicate.test(""));
		
		//biConsumer
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> {
			System.out.println("num1 + num2 : " + (num1 + num2));
		};
		biConsumer.accept(10, 20);
		
		//UnaryOperator
		UnaryOperator<Integer> operator = num -> num * num;
		System.out.println(operator.apply(10));
		
		//BinaryOperator
		BinaryOperator<Integer> operator2 = (num1, num2) -> num1 * num2;
		System.out.println(operator2.apply(10, 20));
	}

}
