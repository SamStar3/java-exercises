package ArrayBasic;

public class smallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int[] arr = { 3, 4, 2, 5, 6, 8 };
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);

	}

}
