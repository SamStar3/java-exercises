package ArrayBasic;

public class specificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 2, 5, 3, 6, };
		int specific = 5;
		for (int i = 1; i < arr.length - 1; i++) {
			if (specific == i) {
				System.out.println("Yes this value is inside our array : " + arr[i]);
				break;
			}
		}

	}

}
