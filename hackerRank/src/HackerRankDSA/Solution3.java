package HackerRankDSA;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();
		int[][] addNumbers = new int[16][3];

		for (int i = 0; i < 6; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		bufferedReader.close();
		int k = 2;
		int k1 = 2;
		int iter = 1;
		int sum = 0;
		int index = 0;
		int indexTwo = 0;
		int demo = 0;

		// first
		for (int i = 0; i < 4; i++) {
			// second
			for (int j = i; j <= k; j++) {

				// third
				for (int x = 0; x < 4; x++) {
					// fourth
					for (int y = x; y <= k1; y++) {
						if (j == iter) {
							if (y == x || y == k1) {
								sum = sum + 0;
							} else {
								sum = sum + arr.get(j).get(y);
							}
						} else {
							sum = sum + arr.get(j).get(y);
						}
					} // fourth
					addNumbers[(indexTwo++ % 4) + demo][index] = sum;
					k1 = k1 + 1;
					sum = 0;
				} // third
				index = index + 1;
				k1 = 2;

			} // second
			k = k + 1;
			iter = iter + 1;
			index = 0;
			demo = demo + 4;
		} // first

		int res = 0;
		int z = Integer.MIN_VALUE;
		for (int i = 0; i < addNumbers.length; i++) {
			for (int j = 0; j < addNumbers[0].length; j++) {
				res = res + addNumbers[i][j];
			}
			if (res > z) {
				z = res;
			}
			res = 0;
		}
		// finial result
		System.out.println(z);

	}
}
