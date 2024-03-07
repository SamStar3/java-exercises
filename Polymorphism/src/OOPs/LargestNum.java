package OOPs;

public class LargestNum {

	static int largest(int a, int b) {
		return a > b ? a : b;
	}

	static double largest(int a, double b) {
		return a > b ? a : b;
	}

	static double largest(double a, double b) {
		return a > b ? a : b;
	}

	static char largest(char a, char b) {
		return a > b ? a : b;
	}

	static float largest(float a, float b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest(3, 6));
		System.out.println(largest(45, 34.4));
		System.out.println(largest(23.43, 23.42));
		System.out.println(largest('s', 'e'));
		System.out.println(largest(32.4f, 43.2f));

	}

}
