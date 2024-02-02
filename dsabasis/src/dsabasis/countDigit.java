package dsabasis;

public class countDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = 74856;
		int r = 0;
		while (s>0) {
			s = s/10;
			r++;
		}
		System.out.println(r);
		

	}

}
