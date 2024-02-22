package dsabasis;

public class factorialPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n);

	}

	static int print(int n) {
		if (n <= 0) {
			return 1;
		} else {
			int a = n;
//			print(n - 1);

//			System.out.print(n*print(n -n);
//			print(n - 1);
			return n * print(n - 1);
//			? 
		}
	}

}
