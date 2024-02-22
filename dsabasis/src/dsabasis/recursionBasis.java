package dsabasis;

public class recursionBasis {
	static void print(int n) {
		if (n <= 0) {
			return;
		} else {
			System.out.print(n + " ");
			print(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		print(n);

	}

}
