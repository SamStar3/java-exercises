package dsabasis;

public class multiRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 1;
		print(n, k);

	}

	static void print(int n, int k) {
		if (n <= 0) {
			return;
		} else {
//			System.out.print(n + " ");
			print(n - 1, k * n);
			System.out.print(k + " ");
		}
	}

}
