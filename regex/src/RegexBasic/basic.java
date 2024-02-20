package RegexBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "revanth, sam , sankar, revanthkumar, sam star";
		Pattern p = Pattern.compile("revanth");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.println(m.group() + " " + count + " times " + " starts at " + m.start() + " ends at " + m.end());
		}

	}

}
