package Elab;

import java.util.Scanner;

public class iplMatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iplno = input.nextInt();
		System.out.println(Integer.toOctalString(iplno));
		System.out.println(Integer.toHexString(iplno));
	

	}

}
