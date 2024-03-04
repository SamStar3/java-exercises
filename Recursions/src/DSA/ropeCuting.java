package DSA;

public class ropeCuting {

	public static int maxCut(int n, int a, int b, int c) {

		if (n == 0) {
			return 0;
		} else if (n <= -1) {
			return -1;
		}

		int result = Math.max(maxCut(n - a, a, b, c), Math.max(maxCut(n - b, a, b, c), maxCut(n - c, a, b, c)));

		if (result == -1) {
			return -1;
		}
		return result + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 23;
		int a = 12;
		int b = 9;
		int c = 11;
		System.out.println(maxCut(n, a, b, c));

	}

}
