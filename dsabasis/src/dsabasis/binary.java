package dsabasis;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 7;
		int a=0;
		while(n>0) {
			if(n%2!=0)
				a++;
			n/=2;
//			System.out.println(a);
		}
		System.out.println(a);

	}

}
