package Exception;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 32;
		int b = 0;
		int c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.err.println("Error Occurent");
		}

	}

}
