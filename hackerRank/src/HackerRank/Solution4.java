package HackerRank;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int length = str.length();
		int k = s.nextInt();
		int a = 0;
		while (true) {
			if (k > length) {
				break;
			} else {
				String cutVal = str.substring(a, k);
				System.out.println(str.substring(a, k));
//				list.add(cutVal);
				k += 1;
				a += 1;
			}

		}

	}
}
