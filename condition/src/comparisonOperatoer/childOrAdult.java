package comparisonOperatoer;

import java.util.Scanner;

public class childOrAdult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find the given age is child, adult or senior citizen
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if (a<18 ) {
			System.out.println("he is child ");
			
		}
		if (a>18 && a<60) {
			System.out.println("he is adult ");
			
		}
		if (a>60) {
			System.out.println("he is senior citizen ");
			
		}
		

	}

}
