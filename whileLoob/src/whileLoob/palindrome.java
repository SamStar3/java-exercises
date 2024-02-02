package whileLoob;

import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i =givenNum;
		int num1 =0;
		int num2 =0;
		while (i!=0) {
			num1 =i%10;
			num2 = num2 *10+num1;
			i/=10;
			
		}
		if(num2==givenNum) {
			System.out.println("it's palindrome number ");
		}else 
			
		System.out.println("it's not palindrome number ");

	}

}
