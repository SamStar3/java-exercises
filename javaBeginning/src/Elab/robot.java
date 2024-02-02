package Elab;

import java.util.Scanner;

public class robot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		a = input.nextInt();
		b = (360%(180-a));
		System.out.println(b==0? "yes":"no");
		

	}

}
