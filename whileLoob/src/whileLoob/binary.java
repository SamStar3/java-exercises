package whileLoob;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i=givenNum;
		int num1 =0;
		int num2 =0;
		int num3 =1;
		while (i>0) {
			num1 = i%2;
			num2 += num1*num3;
			num3*=10;
			i/=2;
		}
		System.out.println(num2);

	}

}
