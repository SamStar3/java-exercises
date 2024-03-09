package FileHandling;

import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter file = new FileWriter("Example.txt");
			file.write("I am Sam");
			file.close();

		} catch (Exception e) {
			System.out.println("File Not Founded");
		}

	}

}
