package loopsForJava;

import java.util.Scanner;

public class octToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int num1 =0;
		int num2 =0;
		int num3 =0;
		int num4 =0;
		String str = "";
		for (int i = 0;i<=4; i++) {
			num1 = givenNum%10;
			num2 = (int) Math.pow(8,i) * num1;
			givenNum/=10;
			num3+=num2;
		}
		System.out.println(num3);
		for (int j =num3; j>0;j/=16) {
			num4 = j %16;
			if (num4==10) {
				String A = "A";
				str = A+str;
			}else if(num4==11 ) {
					String B = "B";
					str = B+str;
				}else
				if (num4 == 12) {
					String C = "C";
					str = C+str;
				} else if (num4 == 13) {
					String D = "D";
					str = D+str;
				}else if (num4 == 14 ) {
					String E = "E";
					str = E+str;
				}else if (num4 == 15) {
					String F = "F";
					str = F+str;
				}else 
				{
					str = Integer.toString(num4)+str;
				}
		}
		System.out.println(str);

	}

}
