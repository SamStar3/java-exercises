package comparisonOperatoer;

public class armStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 105;
		int b = a%10;
		int c = a/10;
		int d = c%10;
		int e = c/10;
		int f = e%10;
		int g = b*b*b;
		int h = d*d*d;
		int i = f*f*f;
		int j = g+h+i;
	     if(a==j) {
	    	 System.out.println("it's armstrong number ");
	    	 
	     }else 
	    	 System.out.println("it's not armstrong number ");
//		System.out.println(j);
//		if(b!=0) {
//			b=b*b*b;
////		}else
////		{
////			if(b==0) {
////				b=b*b*b;
////			}
//		}
//
	}
//
}
