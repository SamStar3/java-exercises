package ArrayBasic;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 4, 5, 2, 4, 1, 6 };
//		int duplicate = 0;
//		for (int i =0;i<arr.length;i++) {
//			for(int j = i+1;j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					duplicate = arr[i];
//					break;
//				}
//			}
//		}
//		
//		for(int k= 0;k<arr.length-1;k++) {
//			System.out.println(arr.
//		}
		String[] stringarr = { "aa", "sd", "aa", "aa", "bb", "ed", "bb", "ec" };
		String[] duplicateString = new String[stringarr.length];
		int x = 0;
		for (int i = 0; i < stringarr.length; i++) {
			for (int j = i + 1; j < stringarr.length; j++) {
				if (stringarr[i].equals(stringarr[j])) {
					stringarr[i] = stringarr[i].replace(stringarr[i], "");
					break;
				}
			}
		}

		String joinedString = String.join(",", stringarr);
		System.out.println(joinedString);

	}

}
