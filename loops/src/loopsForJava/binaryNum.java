package loopsForJava;

import java.util.Scanner;

public class binaryNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 0;
		int a =1;
//		String b = "";
		int bin = 0;
		for (int i =n; i>0; i/=2) {
//			b=b*10;
			j =i%2;
//			b=b*10;
//			a = a*10+j;
//			String rev = Integer.toString(j);
//			b=rev+b;
			bin += j * a;
			  
		    a *= 10;
			

			
//			System.out.println(b);
		}
		System.out.println(bin);


	}

}
