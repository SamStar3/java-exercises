package dsabasis;

public class trailingZeroinFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a =1;
		for (int i=2;i<=n;i++) {
			a=a*i;
		}
		int b=0;
		while (a%10==0) {
			b++;
			a=a/10;
		}
		System.out.print(b);

	}

}
