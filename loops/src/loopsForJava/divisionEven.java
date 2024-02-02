package loopsForJava;

import java.util.Scanner;

public class divisionEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double n = s.nextInt();
		double j = 0.0;
		double sum = 0;
		for(int i=2; i<=n;i+=2) {
			j = (double)1/Math.pow(i, 2);
			sum+=j;
//			System.out.println(sum);
		}
		System.out.println(sum);

	}

}
