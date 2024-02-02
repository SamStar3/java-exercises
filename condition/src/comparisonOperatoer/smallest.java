package comparisonOperatoer;
import java.util.Scanner;
public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find smallest number of three number 
		
		Scanner s = new Scanner(System.in);
		Scanner p = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = p.nextInt();
		int c = r.nextInt();
		
		if(a<b && a<c) {
			System.out.println("the smallest number is : " + a);
		}
		if (b<c && b<a) {
			System.out.println("the smallest number is : " +b);
			
		}
		if (c<a && c<b) {
			System.out.println("the smallest number is : " +c);
		}

	}

}
