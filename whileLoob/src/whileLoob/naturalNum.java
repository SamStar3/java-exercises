package whileLoob;

import java.util.Scanner;

public class naturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int givenNum = s.nextInt();
		int i = 1;
		while(i <= givenNum)
		{
			System.out.println(i);
			i++;
		}
	}

}
