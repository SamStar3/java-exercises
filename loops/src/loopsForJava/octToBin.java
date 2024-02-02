package loopsForJava;

import java.util.Scanner;

public class octToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int num1 = 0;
		int num2 =0;
		int num3 =0;
		int num4 =0;
		int num5 =1;
		int num6=0;
		for (int i = 0;i<4;i++) {
			num1 = givenNum%10;
			num2 = (int) Math.pow(8,i)*num1;
	        givenNum/=10;
	        num3+=num2;
		}
		System.out.println(num3);
		for (int j=num3;j>0;j/=2) {
			num4 = j%2;
			num6 = num6 + num4*num5;
			num5*=10;
		}
		System.out.println(num6);
			

	}

}
