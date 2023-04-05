package j14_lombok;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Apt {

	private int floor;
	private int width;
	private int height;
}
