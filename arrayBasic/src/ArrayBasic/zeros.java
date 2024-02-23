package ArrayBasic;

public class zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 3, 0, 0, 3, 5, 7, 0, 1, 0, 2, 0, 0, 9, 8, 0 };
		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0 && (i != arr.length - 1)) {
//				arr[i] = arr[i + 1];
//				arr[i + 1] = a;

//				
//				for (int j = i; j < arr.length; j++) {
//					arr[j] = i + 1;
//					for (int k = j + 1; k <= j + 1; k++) {
//						arr[j] = arr[k];
//					}
//					
//					}
//			}
//				System.out.println(arr[j]);
//		}
//		for (int m = 0; m < arr.length; m++) {
//			System.out.print(arr[m]);
//		}

	}
}
