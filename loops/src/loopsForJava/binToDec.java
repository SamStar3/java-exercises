package loopsForJava;

import java.util.Scanner;

public class binToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum=s.nextInt();
		int num1 = 0;
		int num2 =0;
		int num3 = 0;
		int num4 =0;
		int num5 =0;
		int num6=1;
		for (int i = 0;i<=4;i++) {
			num1 = givenNum%10;
			givenNum = givenNum/10;
			num2 = (int) Math.pow(2, i) *num1 ;
			num3 = num2 +num3;
			
		}
		for (int j =num3; j!=0;j/=8) {
			
		num4=j%8;
		num5 = num5 + (num4 * num6);
		num6*=10;
//		System.out.println(num4);
		}
		System.out.println(num5);

	}

}
