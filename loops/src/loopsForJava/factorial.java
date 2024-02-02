package loopsForJava;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 1;
		for (int i =1; i<=n; i++) {
			j = i*j;
			}
		System.out.println(j);

	}

}
