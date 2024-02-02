package loopsForJava;

import java.util.Scanner;

public class octalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int subNum1 = 0;
		int subNum2 =1;
		
		int rev = 0;
		for (int i = givenNum; i>0;i/=8) {
			subNum1 = i%8;
			rev = rev + subNum1 * subNum2;
			subNum2*=10;
//			System.out.println(rev);
		}
		System.out.println(rev);

	}

}
