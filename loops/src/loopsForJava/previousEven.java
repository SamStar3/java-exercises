package loopsForJava;

import java.util.Scanner;

public class previousEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n%2!=0) {
			System.out.println("it's not even number");
		}else 
		for(int i =2; i<n;i+=2) {
			System.out.println(i);
		}

	}

}
