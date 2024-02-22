package HackerRankDSA;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 9, 2, -4, -4, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 }, };

		int k = 2;
		int k1 = 2;
		int iter = 1;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = i; j <= k; j++) {
				for (int x = 0; x < 4; x++) {
					for (int y = x; y <= k1; y++) {
						if (j == iter) {
							if (y == x || y == k1) {
								sum = sum + 0;
							} else {
								System.out.print(arr[j][y]);
								sum = sum + arr[j][y];
							}
						} else {
							System.out.print(arr[j][y]);
							sum = sum + arr[j][y];
						}
					}
					System.out.print("\t");
					k1 = k1 + 1;
				}
				System.out.println();
				k1 = 2;
			}
			System.out.println();
			k = k + 1;
			iter++;

		}

	}

}
