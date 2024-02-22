package ArrayBasic;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 36, 64, 66, 66 };
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			} else if (secondLargest < arr[i] && largest != arr[i]) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);

	}

}
