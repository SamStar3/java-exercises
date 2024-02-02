package loopsForJava;

import java.util.Scanner;

public class squareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = (int) s.nextInt();
		int j = 0;
		int sum = 0;
		for(int i =1; i<=n; i++) {
			j=(int) Math.pow(i, 2);
//			j=j+j;
			sum= sum+j;
			
		}
		System.out.print(sum+"\t");
	}

}
