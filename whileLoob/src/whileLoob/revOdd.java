package whileLoob;

import java.util.Scanner;

public class revOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i = 9;
		while (i>=givenNum) {
			System.out.println(i);
			i-=2;
		}
	}

}
