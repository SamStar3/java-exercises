package Studentproject;

import java.util.Scanner;

public class student {

	public String getValue(String name, int age, int rollNo) {
		return name + " " + age + " " + rollNo;

	}

	public static void main(String[] args) {

//		student detials = new student();
		Scanner sc = new Scanner(System.in);

		System.out.println("how many student are there ");
		int noOfstudents = sc.nextInt();

		student[] studentdata = new student[noOfstudents];

		for (int i = 0; i < noOfstudents; i++) {

			System.out.println("Student name : ");
			String name = sc.nextLine();
			sc.nextLine();

			System.out.println("Student age : ");
			int age = sc.nextInt();

			System.out.println("Student rollNo : ");
			int rollNo = sc.nextInt();

			student std = new student();
			studentdata[i] = std;
			studentdata[i].getValue(name, age, rollNo);

		}
		for (student result : studentdata) {
			System.out.println(result);
		}

	}

}
