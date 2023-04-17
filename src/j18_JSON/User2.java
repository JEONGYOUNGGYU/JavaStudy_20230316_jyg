package j18_JSON;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User2 {
	private String name;
	private String id;
	private String password;
	private String email;
}
