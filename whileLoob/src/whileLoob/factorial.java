package whileLoob;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i = 1;
		int num1 = 1;
		int num2 =0;
		while (i<=givenNum) {
			
			num1*=i;
			
//			System.out.println(num1);
			i++;
		}
		System.out.println(num1);

	}

}
