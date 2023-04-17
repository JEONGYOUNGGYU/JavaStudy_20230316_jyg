package j20_예외처리;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		int[] numArray = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < 5; i++) {
			
			try {
				System.out.println(numArray[i]);
			
				throw new NullPointerException();
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외가 발생하였습니다.");
				
			}
			catch (Exception e) {
				System.out.println("예외가 발생하였습니다.2");
				e.printStackTrace();
			}
			
			finally {
				System.out.println("예외 발생 유무에 상관없이 무조건 실행");
			}
		}
	}
}
