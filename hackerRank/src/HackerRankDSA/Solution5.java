package HackerRankDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> dynamicArray = new ArrayList();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			dynamicArray.add(new ArrayList<>(Arrays.asList(str.split(" "))));
		}
		int n1 = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n1; i++) {
			String str = scan.nextLine();
			try {
				System.out.println(dynamicArray.get(Integer.parseInt(str.split(" ")[0]) - 1)
						.get(Integer.parseInt(str.split(" ")[1])));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}

		}

	}
}
