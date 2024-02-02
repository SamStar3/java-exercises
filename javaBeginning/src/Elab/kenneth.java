package Elab;

import java.util.Scanner;

public class kenneth {

	public static void main(String[] args) {
	int r,o,c;
		Scanner input = new Scanner(System.in);
	    r = input.nextInt();
	    o = input.nextInt();
	    c = input.nextInt();
	    int a = 20-o;
	    int b = (a*6*6)+c;
	    String d = (r<b)? "yes" : "no";
	    System.out.print(d);

	}

}
