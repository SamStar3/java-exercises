package loopsForJava;

import java.util.Scanner;

public class squareEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 0;
		int sum = 0;
		for (int i=2; i<=n;i+=2) {
			j =(int) Math.pow(i, 2);
			sum+=j;
		}
		System.out.print(sum);

	}

}
