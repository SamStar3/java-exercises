package loopsForJava;

import java.util.Scanner;

public class pellSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum=s.nextInt();
		int num1 = 0;
		int num2 =1;
		int num3 =0;
		for (int i=0; i<givenNum;i++) {
			num3 = num1+num2*2;
			num1 = num2 ;
			num2 = num3;
			System.out.println(num3);
		}

	}

}
