package loopsForJava;

import java.util.Scanner;

public class perfectNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j =0;
		for(int i =1;i<n;i*=2) {
			j+=i;
//			System.out.println(i);
		}
		System.out.println(j);
//		if()

	}

}
