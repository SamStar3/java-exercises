package comparisonOperatoer;

import java.util.Scanner;

public class biggest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find biggest of three numbers 
		
		Scanner s = new Scanner(System.in);
		Scanner p = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		int a = s.nextInt();
		int b = p.nextInt();
		int c = r.nextInt();
		
		if (a>b && a>c) {
			System.out.println("the biggest number is :" + a);
			
		}
		
		 if (b>a && b>c) {
			 System.out.println("the biggest number is :" + b);
			 
		 }
		 if (c>a && c>b) {
			 System.out.println("the biggest number is :" + c);
		 }
		 
		
		
	}

}
