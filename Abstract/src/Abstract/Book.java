package Abstract;

import java.util.Scanner;

abstract class Books {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

class MyBook extends Books {
	void setTitle(String s) {
		title = s;
	}
}

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}

}
