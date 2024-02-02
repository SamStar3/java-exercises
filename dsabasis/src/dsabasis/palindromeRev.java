package dsabasis;

public class palindromeRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s= 34658;
		int r = 0;
		int a = 0;
		while (s!=0) {
			a = s%10;
			r = r*10+a;
			s = s/10;
		}
		System.out.print(r);

	}

}
