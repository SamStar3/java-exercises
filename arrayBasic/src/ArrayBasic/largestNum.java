package ArrayBasic;

public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 4, 5, 9 };
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {

				largest = arr[i];
			}
		}
		System.out.println(largest);

	}

}
