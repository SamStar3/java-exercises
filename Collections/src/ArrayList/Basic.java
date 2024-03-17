package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(34);
		list.add(234);

		for (int i = 0; i <= 10; i++) {
			list.add(i);
//			System.out.println(list.get(i));
		}

		list.set(0, 3);
		list.remove(1);
		list.contains(0);
//		for (int j : list) {
//			System.out.println(j);
//		}
		Iterator<Integer> i = list.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
		System.out.println("Using Iterator");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(list);

//		for (alist j : list) {
//
//		}

	}

}
