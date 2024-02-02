package loopsForJava;

import java.util.Scanner;

public class hexaToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int num1= 0;
		num1 = Integer.parseInt(str, 16);
		System.out.println(num1);

	}

}
