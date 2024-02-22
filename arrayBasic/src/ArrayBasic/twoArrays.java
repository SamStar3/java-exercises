package ArrayBasic;

public class twoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 4, 1, 5, 7 };
		int[] arr2 = { 9, 7, 0, 1, 2 };
		int[] temp = new int[arr1.length];
		int tempCount = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					temp[tempCount++] = arr1[i];
				}
			}
		}
		for (int k = 0; k < tempCount; k++) {
			System.out.println(temp[k]);
		}
	}

}
