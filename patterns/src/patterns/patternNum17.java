package patterns;

public class patternNum17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int num = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = num; j <= n; j++) {
				System.out.print(j);

			}
			num--;
			System.out.println();
		}

	}

}
