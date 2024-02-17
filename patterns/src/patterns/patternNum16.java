package patterns;

public class patternNum16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int m = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j <= m; j--) {
				System.out.print(j);
				m++;
			}
			System.out.println();
		}

	}

}
