package HackerRankDSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
//
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		in.nextLine();
//		for (int i = 0; i < n; i++) {
//			String name = in.nextLine();
//			int phone = in.nextInt();
//			in.nextLine();
//			x.add(new ArrayList<String>());
//			int j = 0;
//			x.get(i).add(j, name);
//			j += 1;
//			x.get(i).add(j, String.valueOf(phone));
////			in.nextLine();
//		}
//		
//		Collections.sort(x);
//		System.out.println(x);

//		while (in.hasNext()) {
//			String s = in.nextLine();
//			int count = 0;
//			for (int i = 0; i < x.size(); i++) {
//				if (x.get(i).get(0).equals(s)) {
//					System.out.println(x.get(i).get(0) + "=" + x.get(i).get(1));
//				} else {
//					count++;
//				}
//				if (count == x.size()) {
//					System.out.println("Not found");
//				}
//			}
//		}

		Map<String, Integer> map = new HashMap<>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phonenumber = in.nextInt();
			in.nextLine();
			map.put(name, phonenumber);
		}

		while (in.hasNext()) {
			String s = in.nextLine();
			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}
		}

	}

}
