package whileLoob;

import java.util.Scanner;

public class integerNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i = -10;
		while (true) {
			if (i==givenNum) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
