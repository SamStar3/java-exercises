package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentShow {

	String name, rollNo;

	StudentShow(String name, String rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	void studentAdd(ArrayList<String> str) {
		str.add(name);
		str.add(rollNo);
	}

	void studentShow(ArrayList<String> str) {
//		if (str.size() == 0) {
//			System.out.println("Invalid");
//		} else
		for (String show : str) {
			System.out.println(show);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char option;
		String name, rollNo;
		StudentShow add = null;
		ArrayList<String> str = new ArrayList<>();

		do {
			System.out.println("Do you want to add Student press a ");
			System.out.println("Show the Total Student press s");
			System.out.println("Do you want to exit here press e ");
			option = sc.nextLine().charAt(0);
			switch (option) {
			case 'a':
				System.out.println("Enter your Name :");
				name = sc.nextLine();
				System.out.println("Enter your RollNo :");
				rollNo = sc.nextLine();
				add = new StudentShow(name, rollNo);
				add.studentAdd(str);
				break;
			case 's':
				try {
					add.studentShow(str);
				} catch (Exception e) {
					System.out.println("Sorry there is no Students");
				}
				break;
			case 'e':
				System.out.println("Thanks for visiting");
				break;
			default:
				System.out.println("Invalid");

			}

		} while (option != 'e');

	}

}
