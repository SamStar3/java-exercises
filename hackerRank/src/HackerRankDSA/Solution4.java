package HackerRankDSA;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 4, -5, 1 };
		int a = arr.length;
		int b = 0;
		int c = 0;
		int result = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i);
			for (int j = 0; j < a; j++) {
				for (int k = j; k <= b; k++) {
					result = result + arr[k];
//					System.out.print(result);
				}
//				System.out.print(result);
				if (result < 0) {
					count++;
				}
				result = 0;
				b++;

//				System.out.println();
			}
			a--;
			c++;
			b = c;
//			System.out.println();
		}
		System.out.print(count);

//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i; j <= i + 1; j++) {
//				for (int k = i; k <= i + 2; k++) {
//					System.out.print(" " + arr[k]);
//					for(int )
//				}
////				System.out.println();
//				System.out.print(arr[j]);
//			}
//			System.out.println();
//		}

	}

}
