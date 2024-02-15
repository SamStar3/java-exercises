package HackerRank;

import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			String repeated = new String(new char[15 - s1.length()]).replace("\0", " ");
			if (String.valueOf(x).length() == 1) {
				System.out.println(s1 + repeated + "00" + String.valueOf(x));
			} else if (String.valueOf(x).length() == 2) {
				System.out.println(s1 + repeated + "0" + String.valueOf(x));
			} else {
				System.out.println(s1 + repeated + String.valueOf(x));

			}
		}

	}

}
