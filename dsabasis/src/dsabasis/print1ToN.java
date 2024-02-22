package dsabasis;

public class print1ToN {
	static void print(int n, int k) {
		if (n <= 0) {
			return;
		} else {
			System.out.print(k + " ");
			print(n - 1, k + 1);
		}
//		if (n <= 0) {
//			return;
//		}
//		print(n - 1);
//		System.out.print(n + " ");
//		for (int i = 1; i <= n; i++) {
//			System.out.print(i + " ");
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int k = 1;
		print(n, k);

	}

}
