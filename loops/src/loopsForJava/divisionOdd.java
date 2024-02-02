package loopsForJava;

import java.util.Scanner;

public class divisionOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		double j =0;
		double sum = 0;
		for(int i =1;i<=n;i+=2){
			j = (double) 1/Math.pow(i, 2);
			sum =+j;
//			System.out.println(j);
		}
		System.out.println(sum);

	}

}
