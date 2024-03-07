package OOPs;

public class AverageNum {

	static double Average(int a, int b, int c) {
		return ((a + b + c) / 3);
	}

	static double Average(int a, int b) {
		return ((a + b) / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Average(23, 53, 44));
		System.out.println(Average(34, 36));

	}

}
