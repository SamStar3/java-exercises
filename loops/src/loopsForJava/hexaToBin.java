package loopsForJava;

import java.util.Scanner;

public class hexaToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int num1 = 0;
		int num2=0;
		int num3 =0;
		int num4 =1;
		num1 = Integer.parseInt(str, 16);
		for (int i = num1;i>0;i/=2) {
			num2 += i %2*num4;
			num4 *=10;
			
//			System.out.println(num2);
		}
		
		System.out.println(num2);
	}
	

}
