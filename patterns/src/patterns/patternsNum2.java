package patterns;

public class patternsNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j >= i + 1) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}

//				System.out.print(j);

			}
			System.out.println();
		}

	}

}
