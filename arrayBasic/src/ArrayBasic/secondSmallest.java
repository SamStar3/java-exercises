package ArrayBasic;

public class secondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 43, 654, 23, 75, 23, 34 };
		int smallest = arr[0];
		int secondSmallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (smallest > arr[i]) {
				secondSmallest = smallest;
				smallest = arr[i];

			} else if (secondSmallest > arr[i] && smallest != arr[i]) {
				secondSmallest = arr[i];
			}
		}
		System.out.println(secondSmallest);

	}

}
