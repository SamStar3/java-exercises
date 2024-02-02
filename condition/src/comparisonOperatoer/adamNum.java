package comparisonOperatoer;

public class adamNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 31;
		int r = 0;
		int b = a*a;
		int c = b%10;
//		int z = a/10
		int d = r*10+c;
		int e = b/10;
		int f = e%10;
		int g = d*10+f;
//		int h = e%10;
		int i = e/10;
		int h = e%10;
		int j = g*10+i;
		if (j==169) {
			System.out.println("it's adamNumber");
		}else
			
		System.out.println("it's not adam number");

	}

}
