package stringLearning;

import java.util.Scanner;

public class palindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = str.length()-1;
		String rev = "";
//		System.out.println(str.charAt(0));
		for (int i =a; i>=0;i--) {
			rev +=str.charAt(i);
			
		}
//		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("it is Palindrome String ");
		}else {
			System.out.println("it is not Palindrome String");
		}
	}

}
