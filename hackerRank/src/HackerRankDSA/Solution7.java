package HackerRankDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		int[] insertArray = new int[2];

		Scanner scan = new Scanner(System.in);

		// add array
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int numbers = scan.nextInt();
			array.add(numbers);
		}
		scan.nextLine();

		// operations
		int curdNumber = scan.nextInt();

		for (int i = 0; i <= curdNumber; i++) {

			String operation = scan.nextLine();
			if (operation.equals("Insert")) {

				String insertOperation = scan.nextLine();
				array.add(Integer.parseInt(insertOperation.split(" ")[0]),
						Integer.parseInt(insertOperation.split(" ")[1]));
			}
			if (operation.equals("Delete")) {
				String insertOperation = scan.nextLine();
				array.remove(Integer.parseInt(insertOperation.split(" ")[0]));
			}
		}

		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
	}

}
