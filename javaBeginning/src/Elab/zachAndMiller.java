package Elab;

import java.util.Scanner;

public class zachAndMiller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		n = input.nextInt();
		m = input.nextInt();
		int d = (n+m)/3;
		System.out.println(Math.min(Math.min(n,m),Math.min(m, d)));
	}

}
