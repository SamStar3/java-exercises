package patterns;

public class patternNum13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(num);
				num++;
			}
			num = i + 1;
			System.out.println();
		}

	}

}
