package whileLoob;

import java.util.Scanner;

public class evenSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i = 1;
		int num1 = 1;
		while (i<=givenNum) {
			num1 = (int) Math.pow(i, 2);
			System.out.println(num1);
			i+=2;
		}

	}

}
