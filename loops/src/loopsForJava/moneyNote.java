package loopsForJava;

import java.util.Scanner;

public class moneyNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int subNum1 = 0;
		int subNum2 = 0;
		int subNum3 = 0;
		
		if (givenNum >=500) {
			subNum1 =(int) givenNum/500;
			givenNum = givenNum - (subNum1*500);
			System.out.println(subNum1 + " 500 rubees notes are there ");
		}if (givenNum >=200) {
			subNum2 = (givenNum/200);
			givenNum = givenNum - (subNum2 *200);
			System.out.println(subNum2 + " 200 rubees notes are there ");
		}if (givenNum>=100) {
			subNum3 = givenNum/100;
			givenNum = givenNum - (subNum3*100);
			System.out.println(subNum3 + " 100 rubees notes are there ");
		}else 
		System.out.println("it's less than 100 rubees");

	}

}
