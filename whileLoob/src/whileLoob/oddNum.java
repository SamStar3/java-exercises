package whileLoob;

import java.util.Scanner;

public class oddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i = 1;
		while (true) {
			if (i == givenNum) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
			i+=2;
		}

	}

}
