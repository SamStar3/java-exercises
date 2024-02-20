package HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			String strVal = in.nextLine();

			String regex = "(?i)\\b(\\w+)(\\s+\\1\\b)+";
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(strVal);
			while (match.find()) {
				strVal = strVal.replaceAll(match.group(0), match.group(1));
			}
			System.out.println(strVal);
		}
	}
}
