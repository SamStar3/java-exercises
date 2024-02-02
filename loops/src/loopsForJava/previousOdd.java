package loopsForJava;

import java.util.Scanner;

public class previousOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n%2==0) {
			System.out.println("it's not odd number ");
		}else
		for (int i = 1; i <n; i+=2) {
//			if (n%2==0) {
//				System.out.println("it's not odd number ");
//			}
			System.out.println(i);
		}
//		if (n%2!=0) {
//			n-=2;
//			System.out.println(n);
//		}else
//		System.out.println("it's not odd number ");
//		

	}

}
