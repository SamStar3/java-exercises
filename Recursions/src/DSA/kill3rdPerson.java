package DSA;

public class kill3rdPerson {

	static int kill(int n, int k) {
		if (n == 1) {
			return 1;
		}
//		kill(n - 1);
//		System.out.println(n);
		else {
			return (kill(n - 1, k) + k - 1) % n + 1;
		}
	}
//	static int myKill(int n,int k);
//	return 	(Kill(n,k)+1);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		int k = 3;
		kill(n, k);
//		myKill(n,k);
		System.out.println(kill(n, k));

	}

}
