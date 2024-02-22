package dsabasis;

public class nTo1Recursion {

	static void nTo1(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.print(n + " ");
			nTo1(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		nTo1(n);

	}

}
