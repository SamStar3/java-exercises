package loopsForJava;

import java.util.Scanner;

public class adamNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 0; 
		int a= 0;
		int w=0;
		int e=0;
		int r =0;
		r=n*n;
		for (int i =r; i!=0;i/=10) {
			j = i%10;
			a= a*10+j;
//			System.out.println(a);
		}
		System.out.println(a);
		for (int q =n; q!=0; q/=10) {
			w=q%10;
			e=e*10+w;
//			System.out.println(e);
		}
		e*=e;
		System.out.println(e);
		 String distinction = a == e ? "it's adam number" : "it's not adam number ";
		 System.out.println(distinction);
//		if (a==e) {
//			System.out.println("it's adam number ");
//			
//		}else
//			System.out.println("it's not adam number ");

	}

}
