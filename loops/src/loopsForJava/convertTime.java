package loopsForJava;

import java.util.Scanner;

public class convertTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		
		int mins =60;
		int sec =60;
		int num1=0;
		double num2 = 0;
//		hour to sec
//		for (int i = 1; i <=givenNum;i++) {
//		num1  += mins * sec;
//		}
//		System.out.print("hour to sec " + num1);
//		min to hour
		
//		
//			num2 =(double)1/60*givenNum;
////		}
//		System.out.println("min to hours " + num2);
//		sec to min 
		
		num2 = (double) 1/60*givenNum;
		System.out.println(num2);
	}

}
