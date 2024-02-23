package ArrayBasic;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] averageNumber = { 23, 4, 5, 6, 2, 8, 100, 3 };
		int smallest = averageNumber[0];
		int largest = 0;
		int sum = 0;
		for (int i = 0; i < averageNumber.length; i++) {
			if (!(smallest < averageNumber[i])) {
				smallest = averageNumber[i];
			}
			if (averageNumber[i] > largest) {
				largest = averageNumber[i];
			}

		}

		for (int i = 0; i < averageNumber.length; i++) {
			if (averageNumber[i] != smallest && averageNumber[i] != largest) {
				sum = sum + averageNumber[i];
			}

		}
		System.out.println(sum);
//		double r = 4;
//		double h = 6;
//		double pi = Math.PI;
//		double u = (double) 1 / 3 * pi * r * r * h;
//		System.out.println(u);
	}

}
