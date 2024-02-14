package patterns;

public class patternNum14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int k = n - 1; k >= 1; k--) {
			for (int j = 1; j <= n - k; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= k; j++) {
				System.out.print(j);
			}
			for (int j = k - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

//		}

	}

}
