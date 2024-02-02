package comparisonOperatoer;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find the temperature in centigrade display a suitable according to the temperature
//		temp less than 0 = freezing 
//				temp from 0 to 10 = very cold 
//				temp from 10 to 20 = cold
//				temp from 20 to 30 = normal 
//				temp from 30 to 40 = hot 
//				temp more than 40 = very hot 
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a<10) {
			System.out.println("it's very cold ");		
		}
		if (a>10 && a<20) {
			System.out.println("it's cold ");
		}
		if (a>20 && a<30) {
			System.out.println("it's normal ");
		}
		if (a>30 && a<40) {
			System.out.println("it's hot ");
		}
		if (a>40) {
			System.out.println("it's very hot ");
		}

	}

}
