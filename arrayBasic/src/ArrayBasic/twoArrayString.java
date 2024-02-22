package ArrayBasic;

public class twoArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "sa", "am", "gy", "re", "fs" };
		String[] arr2 = { "ds", "sa", "rd", "tf", "tr" };
		String[] temp = new String[arr1.length];
		int tempCount = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					temp[tempCount++] = arr1[i];
					break;

				}
			}
		}
		for (int k = 0; k < tempCount; k++) {
			System.out.println(temp[k]);
		}

	}

}
