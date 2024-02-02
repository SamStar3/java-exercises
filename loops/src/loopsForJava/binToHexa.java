package loopsForJava;

import java.util.Scanner;

public class binToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int num1 =0;
		int num2=0;
		int num3 =0;
		int num4 =0;
		int num5 =0;
		String str = "";
		for (int i =0;i<=4;i++) {
			num1 = givenNum%10;
			givenNum/=10;
			num2= (int) Math.pow(2, i) *num1;
			num3 +=num2;
		}
//		System.out.println(num3);
		for (int j =num3;j>0; j/=16) {
			num4 = j%16;
//			System.out.println(num4);
			if (j==10) {
				String A = "A";
				str = A+str;
			}else if (j==11) {
				String B ="B";
				str = B+str;
			}else
				if (j == 12) {
					String C = "C";
					str = C+str;
				} else if (j == 13) {
					String D = "D";
					str = D+str;
				}else if (j == 14 ) {
					String E = "E";
					str = E+str;
				}else if (j == 15) {
					String F = "F";
					str = F+str;
				}else {
					str = Integer.toString(num1)+str;
				}
			System.out.println(str);
		}
				

	}

}
