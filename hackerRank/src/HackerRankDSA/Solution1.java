package HackerRankDSA;

import java.io.IOException;

public class Solution1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
//        int k = 2;
//		for(int i =0; i<6; i++) {
//			
//			for(int j = 0; j<4; j++) {
//				
//			}
//			
//		}

		int k = 2;
		for (int i = 0; i < 6; i++) {
			for (int x = 0; x < 3; x++) {
				for (int j = x; j <= k; j++) {
					System.out.print(arr[x][j]);
				}
				k = k + 1;
				System.out.print("\t");
			}
			k = 2;
			System.out.println();
		}
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		List<List<Integer>> arr = new ArrayList<>();
//		for (int i = 0; i < 6; i++) {
//			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//			List<Integer> arrRowItems = new ArrayList<>();
//
//			for (int j = 0; j < 6; j++) {
//				int arrItem = Integer.parseInt(arrRowTempItems[j]);
//				arrRowItems.add(arrItem);
//			}
//
//			arr.add(arrRowItems);
//
//		}

	}

}
