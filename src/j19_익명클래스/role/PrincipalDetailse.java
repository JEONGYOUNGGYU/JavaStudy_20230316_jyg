package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class PrincipalDetailse {

//	public static void main(String[] args) {
//		String strRoles = "USER_ROLE, ADMIN_ROLE,MANAGE_ROLE";
//		/*
//		 * strRoles를 roleArray 라는 배열에
//		 * USER_ROLE
//		 * ADMIIN_ROLE
//		 * MANAGE_ROLE
//		 * 을 넣고 이 배열을 roles 에넣기
//		 */
//		
//		List<String> roles = new ArrayList<String>();
//		
//		String[] roleArray = strRoles.replaceAll(" ", "").split(",");
//		roles.addAll(Arrays.asList(roleArray));
//		System.out.println(roles);
//		
//		Collection<String> roleDatas = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roleList;
//			}
//		}.getRoles(roles);
//		
//		
//	}
	@NonNull
	private User user;
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		user.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		
		});
		return authorities;
	}
	
	public String getUsername() {
		return user.getUsername();
	}
	
	public String getPassword() {
		return user.getPassword();
	}
	
	
}
