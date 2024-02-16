package HackerRank;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next().toLowerCase();
		String b = scan.next().toLowerCase();

		scan.close();
		String[] char1 = a.split("");
		String[] char2 = b.split("");
		System.out.println(char1);

	}

}
