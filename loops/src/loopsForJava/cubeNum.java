package loopsForJava;

import java.util.Scanner;

public class cubeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int j = 0;
		int sum = 0;
		for(int i =1;i<=n;i++) {
			j =(int) Math.pow(i, 3);
			sum +=j;
		}
		System.out.print(sum+"\t");

	}

}
