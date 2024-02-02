package loopsForJava;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int givenNum = a.nextInt();
		int num1 =0;
		int num2 = 0;
		if (givenNum ==2) {
			System.out.println("it's prime number ");
		}else
		if (givenNum%2==0&&givenNum%3==0) {
			
			System.out.println("it's not prime number ");
		}else {
			System.out.println("it's prime number ");
		}
			
	}

}
