package dsabasis;

import java.util.Scanner;
public class maths {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = 3;
		for (int i =0; i<=(k-1);i++)
				n*=2;
		if ((n&1)!=0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
