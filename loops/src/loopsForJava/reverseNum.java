package loopsForJava;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}

}
