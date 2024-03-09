package Exception;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 40;
		int b = 5;
		int c = 0;
		try {
			c = a / b;

		} catch (Exception e) {
			System.err.println("Error ");
		} finally {
			System.out.println("I don't know ");
		}
		System.out.println(c);

	}

}
