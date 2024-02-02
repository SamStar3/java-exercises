package comparisonOperatoer;

import java.util.Scanner;

public class monthNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = n%12;
		if (a==0) {
			a+=12;
		}
		if (a==1) {
		System.out.println("Jan");
		}
		if (a==2) {
			System.out.println("Feb");
			}
		if (a==3) {
			System.out.println("Mar");
			}

		if (a==4) {
			System.out.println("Apr");
			}
		if (a==5) {
			System.out.println("May");
			}
		if (a==6) {
			System.out.println("Jun");
			}
		if (a==7) {
			System.out.println("Jul");
			}
		if (a==8) {
			System.out.println("Aus");
			}
		if (a==9) {
			System.out.println("Sep");
			}
		if (a==10) {
			System.out.println("Oct");
			}
		if (a==11) {
			System.out.println("Nev");
			}
		if (a==12) {
			System.out.println("Dec");
			}



	}

}
