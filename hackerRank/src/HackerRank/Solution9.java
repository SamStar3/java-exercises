package HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);

		String htmlInput = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

		// Define the regex pattern to match HTML tags
		Pattern pattern = Pattern.compile("<([^\\s>/]+)[^>]*>(.*?)</\\1>");

		// Create a matcher with the input HTML
		Matcher matcher = pattern.matcher(htmlInput);

		// Find and process each HTML tag and its content
		while (matcher.find()) {
			String tag = matcher.group(1);
			String content = matcher.group(2);

			// Process the tag and content here
			System.out.println("Tag: " + tag);
			System.out.println("Content: " + content);
			System.out.println();
		}
	}

}
