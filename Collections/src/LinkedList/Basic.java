package LinkedList;

import java.util.LinkedList;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();

		list.add("sam");
		list.add("reva");
		list.add("sankar");
		list.add("ashwin");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.push("sakmm");
		list.poll();
		list.pop();
		list.remove();
		System.out.println(list.contains("sam"));
		System.out.println(list);

	}

}
