package loopsForJava;

import java.util.Scanner;

public class octToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int givenNum = s.nextInt();
		int num1 = 0;
		int num2 =0;
		int num3 =0;
		for (int i =0;i<4;i++) {
			num1 = givenNum%10;
			num2 =(int) Math.pow(8, i)* num1 ;
			givenNum/=10;
			num3 += num2;
//			System.out.println(num2);
			
		}
		System.out.println(num3);

	}

}
