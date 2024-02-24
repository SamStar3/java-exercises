package Oops1;

import java.util.Scanner;

//with and without

public class with {

	public void show(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		with get = new with();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		get.show(name);
//		get.show("sam");

	}

}
