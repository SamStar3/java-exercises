package Exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 14;
		int b = 0;
		int c = 0;
		try {
			c = a / 0;
			throw new ArithmeticException("it's time to learn");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
