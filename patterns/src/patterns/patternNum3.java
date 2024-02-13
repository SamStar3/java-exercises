package patterns;

public class patternNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int k = n - 1; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

//		}

	}

}
