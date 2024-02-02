package loopsForJava;

import java.util.Scanner;

public class divisionNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double n = s.nextInt();
		double j = 0.0;
		double sum = 0;
		for(int i= 1;i<=n;i++) {
//			j += 1.0/(i*i);
			 j= (double) 1/Math.pow(i,2);
//			System.out.println(j);
			 sum+=j;
		}
//		double i= (double) 1/Math.pow(n,2);
		System.out.println(sum);
	}

}
