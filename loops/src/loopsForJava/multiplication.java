package loopsForJava;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner t = new Scanner(System.in);
		int n = s.nextInt();
		int r = t.nextInt();
		int j = 1;
		for (int i = 1; i <= n; i++) {
			j = i * r;
			System.out.println(i + "*" + r + "=" + j);
		}

	}

}
