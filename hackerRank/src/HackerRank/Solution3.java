package HackerRank;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int length = A.length();
		int length1 = B.length();
		int totalLength = length + length1;
		System.out.println(totalLength);
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

	}

}
