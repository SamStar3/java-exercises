package ArrayBasic;

import java.util.Arrays;

public class equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 2, 3, 5, 1, 5, 3 };
		int[] arr2 = { 2, 3, 5, 1, 5, 3 };
		boolean equal = Arrays.equals(arr1, arr2);
		System.out.println(equal);

	}

}
