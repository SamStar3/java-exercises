package ArrayBasic;

public class leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 16, 17, 4, 3, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					break;
			}
			if (j == arr.length) {
				System.out.print(arr[i] + " ");
			}
		}
	}
//		int sum = arr.length - 1;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
////					System.out.println(arr[j]);
//					break;
//				}
//				if (j == arr.length) {
//					System.out.println(arr[i]);
//				}
//
//			}
//		}

}
