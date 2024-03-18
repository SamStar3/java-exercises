package Hashset;

import java.util.LinkedHashSet;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet<Integer> list = new HashSet<>();// we can't add dublicate value
		LinkedHashSet<Integer> list = new LinkedHashSet<>();

		list.add(5);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(5);
		list.add(3);
		list.add(19);
		list.add(91);
		list.add(80);
		list.add(58);
		System.out.println(list);

		LinkedHashSet<String> list2 = new LinkedHashSet<>();
//		HashSet<String> list2 = new HashSet<>();
		list2.add("sam");
		list2.add("reva");
		list2.add("sam");
		list2.add("sam");
		list2.add("sankar");
		System.out.println(list2);

	}

}
