package loopsForJava;

import java.util.Scanner;

public class evenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		for (int i=2;i<=n;i+=2) {
			System.out.print(i+"\t");
		}

	}

}
