package loopsForJava;

import java.util.Scanner;

public class armstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int j = 0;
		int a = 0;
		int b = 0;
		int num = 0;
		
		for (int i=n;i!=0;i/=10) {
			num++;
			j = i%10;
			a = (int) Math.pow(j, num);
			b+=a;
//			System.out.println(num);
//			num ++;
			
		}
		System.out.println(b);
		if (b==n) {
			System.out.println("its armstrong number ");
		}else 
			System.out.println("it's not armstrong number ");

	}

}
