package comparisonOperatoer;

import java.util.Scanner;

public class gmailChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner p = new Scanner(System.in);
		String gmail = "samstar";
		String pass = "revanthsam";
		String checkg = s.nextLine();
		String checkp = p.nextLine();
		if(gmail==checkg) {
			if (pass == checkp) {
				System.out.println("it's correct. you can enter now ");
			}
		
		}else
			System.out.println("it's invalid. you can enter now ");
		

	}

}
