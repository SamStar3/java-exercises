package Elab;

import java.util.Scanner;

public class romanticLove {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double r1,r2,h,p,r,k,juice;
	    r1 = input.nextDouble();
	    r2 = input.nextDouble();
	    h = input.nextDouble();
	    p = input.nextDouble();
	    r = p/(h*1.0)*(r1-r2)+r2;
	    k = (Math.PI/3.0);
	    juice = k*p*(r*r+(r2*r2)+(r*r2));
	    System.out.println( juice);

	}

}
