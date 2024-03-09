package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("sam");
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
//			System.out.println(e);
			e.printStackTrace();
		}

	}

}
