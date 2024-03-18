package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Bacic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> list = new PriorityQueue<>();
//		Queue<Integer> list = new LinkedList<>();

		list.add(6);
		list.add(4);
		list.add(2);
		list.add(34);
		list.add(28);
		list.add(14);
		list.add(23);
		list.add(1);
		System.out.println(list.peek());
		System.out.println(list.size());
		System.out.println(list);

	}

}
