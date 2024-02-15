package dsabasis;

import java.util.Scanner;

public class boolee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n == 0)
			System.out.println("false");
		while (n != 1) {
			if (n % 2 != 0)
				System.out.println("false");
			n = n / 2;

		}
		System.out.println("true");

	}

}
