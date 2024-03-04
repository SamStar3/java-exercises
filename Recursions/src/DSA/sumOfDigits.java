package DSA;

public class sumOfDigits {

	public static int isAdd(int n) {
//
//		int a = 0;
//		int result = 0;
		if (n == 0) {
			return 0;
		} else {
			return isAdd(n / 10) + n % 10;
		}
//			a = n % 10;
//
//			result = result + a;
//		}
//
//		isAdd(n / 10);
//
//		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumOfDigits add = new sumOfDigits();

		System.out.print(add.isAdd(243));

	}

}
