package comparisonOperatoer;

import java.util.Scanner;

public class oodOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a%2==0) {
			System.out.println("it is even number ");
		}
		if(a%2!=0) {
			System.out.println("it is ood number ");
		}

	}

}
