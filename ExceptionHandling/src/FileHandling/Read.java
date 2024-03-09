package FileHandling;

import java.util.Scanner;

import java.io.File;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("Example.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}

		} catch (Exception e) {
			System.out.println("File Not Found");

		}

	}

}
