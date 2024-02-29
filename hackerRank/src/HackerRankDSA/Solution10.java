package HackerRankDSA;

import java.util.HashSet;
import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		HashSet<String> stringSet = new HashSet<>();
		for (int i = 0; i < t; i++) {
			stringSet.add(pair_left[i] + "," + pair_right[i]);
			System.out.println(stringSet.size());
		}

//		HashSet<String> name = new HashSet<String>();
//
//		name.add("sam");
//		name.add("reva");
//		name.add("saran");
//		name.add("sam");
//		System.out.println(name.size());

	}

}
