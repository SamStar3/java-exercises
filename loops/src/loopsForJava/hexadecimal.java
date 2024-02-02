package loopsForJava;

import java.util.Scanner;

public class hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 1;
		String str = "";
		for (int i = givenNum; i>0; i/=16) {
			num1 = i%16;
			if (num1==10) {
				String A = "A";
				str = A+str;
			}else if(num1==11 ) {
					String B = "B";
					str = B+str;
				}else
				if (num1 == 12) {
					String C = "C";
					str = C+str;
				} else if (num1 == 13) {
					String D = "D";
					str = D+str;
				}else if (num1 == 14 ) {
					String E = "E";
					str = E+str;
				}else if (num1 == 15) {
					String F = "F";
					str = F+str;
				}else 
				{
					str = Integer.toString(num1)+str;
				}
//			num2 = num1 *num3;
//			num3*=10;
////				System.out.println(num2);
			}
		System.out.println(str);
		}
	}



