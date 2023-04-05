package j15_스태틱.싱글톤2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Truck {
	private int carNumber;
	private String company;
	private String model;
	
}
