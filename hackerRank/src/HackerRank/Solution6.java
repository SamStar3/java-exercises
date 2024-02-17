package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String Str = sc.nextLine();
		String expression = "[!,?._'@+ ]";

		for (String ch : Str.split(expression)) {
			if (ch != "") {
				arr.add(ch);
			}

		}
		System.out.println(arr.size());

		for (String ch : arr) {
			System.out.println(ch);
		}

	}

}
