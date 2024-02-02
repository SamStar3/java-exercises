package comparisonOperatoer;

import java.util.Scanner;

public class weekNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = n%7;
		if (a==0) {
			a+=7;
		}
		if (a==1) {
			System.out.println("Mon");
		}
		
		if (a==2) {
			System.out.println("Tue");
		}
		if (a==3) {
			System.out.println("Wed");
		}
		if (a==4) {
			System.out.println("Thu");
		}
		if (a==5) {
			System.out.println("Fri");
		}
		if (a==6) {
			System.out.println("Sat");
		}
		if (a==7) {
			System.out.println("Sun");
		}
		
				
	}
}
