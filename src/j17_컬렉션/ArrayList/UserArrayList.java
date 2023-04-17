package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserArrayList {

	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}

	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디 : ");
		username = scanner.nextLine();
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user);
		
	}
	public void printUserList() {
		System.out.println("사용자 리스트 출력");
		/*
		 * 아이디		> aaa
		 * 비밀번호	> 1234
		 * 이름		> 홍길동
		 * 이메일		> hong@gmail.com
		 * 
		 * 아이디		> aaa
		 * 비밀번호	> 1234
		 * 이름		> 홍길동
		 * 이메일		> hong@gmail.com
		 */
		for(User user : userList) {
			System.out.println("아이디\t>" + user.getUsername());
			System.out.println("비밀번호>" + user.getPassword());
			System.out.println("이름\t>" + user.getName());
			System.out.println("이메일\t>" + user.getEmail());
			System.out.println();
		}
	}
	
	public void removeUser() {
		String username = null;
		String password = null;
		
		System.out.println("아이디 : ");
		username = scanner.nextLine();
		
		for(User user : userList) {
			if(user.getUsername() == username) {
				System.out.println("비밀번호 : ");
				password = scanner.nextLine();
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					System.out.println("삭제 완료");
					return;	//메소드를 빠져나가기 위해 return, break는 반복문만 빠져나가짐
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			}
			
		}
		System.out.println("해당 아이디는 존재하지 않습니다.");
	}
	public static void main(String[] args) {
		/*
		 * [사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 */
		UserArrayList userArrayList = new UserArrayList();
		while(true) {
			
		String select = null;
		
		System.out.println("[사용자 관리 프로그램]");
		System.out.println("1. 사용자 추가");
		System.out.println("2. 사용자 리스트 출력");
		System.out.println("3. 사용자 삭제");
		System.out.println("q. 프로그램 종료");
		System.out.println("메뉴 선택 > ");
		select = userArrayList.scanner.nextLine();
		
		if(select.equals("1")) {
			userArrayList.addUser();
		}else if(select.equals("2")){
			userArrayList.printUserList();
		}else if(select.equals("3")) {
			userArrayList.removeUser();
		}else if(select.equals("q")){
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println();
		}
		
	}
}

}
