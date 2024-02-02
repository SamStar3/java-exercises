package loopsForJava;

import java.util.Scanner;

public class factorialEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 1;
		int sum =0;
		for(int i =1; i<=n;i++) {
			j*=i;
			if (i%2!=0) {
//				System.out.println(j);
				sum+=j;
			}
//			for (int a =1; a<=i;a++) {
//				j*=a;
//			}
//		    sum+=j;
//			System.out.println(i);
		}
		System.out.println(sum);
		

	}

}
