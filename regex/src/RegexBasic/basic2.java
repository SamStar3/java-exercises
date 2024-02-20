package RegexBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sam revanth sankar 1 2 3";
		Pattern pattern = Pattern.compile(" \\d");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group() + " start at " + matcher.start());
		}
	}

}
