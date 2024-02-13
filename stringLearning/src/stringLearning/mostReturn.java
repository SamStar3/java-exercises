package stringLearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mostReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		String str= s.next();
//		for (int i =0; i<str.length();i++) {
//			
//		}
		try {
			Scanner s = new Scanner(System.in);
			int givenNum = s.nextInt();
			if (givenNum == 0) {
				System.out.println("it is not prime number ");
			} else if (givenNum == 2) {
				System.out.println("it is prime number ");
			} else if (givenNum % 2 == 0 && givenNum % 3 == 0) {
				System.out.println("it is prime number");
			} else {
				System.out.println("it is not prime number ");
			}
		} catch (InputMismatchException ex) {
			System.out.println("please provide Only integer input ");
		}

	}

}
