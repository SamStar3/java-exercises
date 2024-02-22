package ArrayBasic;

public class duplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "sam", "sam", "revanth", "sankar" };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		String[] duplicateArr = new String[arr.length];
		int duplicate = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					duplicateArr[duplicate++] = arr[i];
					break;
				}
			}
		}
		for (int k = 0; k < duplicate; k++) {
			System.out.println(duplicateArr[k]);
		}

	}

}
