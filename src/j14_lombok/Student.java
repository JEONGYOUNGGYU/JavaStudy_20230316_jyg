package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
//↑↑↑↑↑ **final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션 필드 주입방식을 사용한 기존 service

//@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Student {
	
	private final int studentCode;
	@NonNull
	private String name;
	private int studentYear;
	private int age;
		
	/*
	 * 1) 생성자
	 * 2) 겟터 셋터
	 * 3) toString
	 * 4) 해쉬코드
	 * 5) equals
	 */
	
}
