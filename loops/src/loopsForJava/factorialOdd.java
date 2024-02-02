package loopsForJava;

import java.util.Scanner;

public class factorialOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 1;
		int sum =0;
		for (int i = 2;i<=n;i++) {
			j*=i;
			if(i%2==0) {
				sum+=j;
			}
		}
		System.out.println(sum);

	}

}
