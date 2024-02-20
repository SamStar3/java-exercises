package RegexBasic;

import java.util.StringTokenizer;

public class tokenizer {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("sam revanth sankar");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

	}

}
