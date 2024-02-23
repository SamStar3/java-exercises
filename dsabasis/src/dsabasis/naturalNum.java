package dsabasis;

public class naturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n);

	}

	static int print(int n) {
		if (n <= 0) {
			return 1;
		} else {

			return n * print(n - 1) / 2;
		}
	}

}
