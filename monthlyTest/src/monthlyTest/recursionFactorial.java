package monthlyTest;

public class recursionFactorial {
	long result = 1;

	public long fun1(int n) {

		result = result * n;

		if (n <= 1) {

//			fun1(n + 1);
//			System.out.println(n);
			return result;

		}

//		System.out.println(n);
		return fun1(n - 1);

	}

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		recursionFactorial opj = new recursionFactorial();

		System.out.println(opj.fun1(13));

//		int result = opj.fun1(6);

//		fun1(6);
//		System.out.println(result);

	}

}
