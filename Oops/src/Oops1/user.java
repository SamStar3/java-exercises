package Oops1;

import java.util.Scanner;

public class user {

	Scanner sc = new Scanner(System.in);

	int age = sc.nextInt();
	int rollNo = sc.nextInt();

	public void show() {
		System.out.println("user age is : " + age);
		System.out.println("user rollNo is : " + rollNo);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user give = new user();
		give.show();

	}

}
