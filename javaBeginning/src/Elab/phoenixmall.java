package Elab;

import java.util.Scanner;

public class phoenixmall {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			int m = input.nextInt();
			int a = input.nextInt();
			System.out.println(((m+a-1)/a)*((n+a-1)/a));
		

	}

}
