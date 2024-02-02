package dsabasis;

import java.util.Scanner;

public class divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		for (int i = 1; i*i<=givenNum;i++){
			if (givenNum%i==0) {
				System.out.println(i);
				if (i!=givenNum/i) {
					System.out.println(givenNum/i);
				}
			}
		}

	}

}
