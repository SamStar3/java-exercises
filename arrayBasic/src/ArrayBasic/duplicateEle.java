package ArrayBasic;

public class duplicateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 54, 32, 54, 74, 23, 32 };
		int[] duplicateArray = new int[arr.length];
		int duplicate = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicateArray[duplicate++] = arr[i];
					break;
				}
			}
		}
		for (int k = 0; k < duplicate; k++) {
			System.out.println(duplicateArray[k]);
		}

	}

}
