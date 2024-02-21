package HackerRank;

public class Solution10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		boolean found = false;
		if (n == 0 || n == 1) {
			System.out.println("not prime");

		} else {
			for (int i = 2; i <= n / 2; i++) {

				if (n % i == 0) {
					found = true;
					break;
				}

			}
			if (found) {
				System.out.print("not prime");
			} else {
				System.out.print("prime");
			}
		}
//		for (int i = 100; i < n; i++) {
//			if (i == 2) {
//				System.out.println("prime" + i);
//			} else if (i == 3) {
//				System.out.println("prime" + i);
//			} else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
//				System.out.println("prime" + i);
//			}
//			else {
//				System.out.println("not prime");
//			}
	}
}

//}
