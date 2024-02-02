package loopsForJava;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 0;
		int r = 0;
		for (int i =n; i!=0;i/=10) {
//			if (n!=0) {
			j = i%10;
//			n = n/10;
			r = r*10+j;
//			n = n/10;
//			}
//			System.out.println(j);
		}
		System.out.println(r);
		if (n==r) {
			System.out.println("it's palindrome");
		}else 
			System.out.println("it's not palindrome");

	}

}
