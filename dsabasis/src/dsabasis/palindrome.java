package dsabasis;

public class palindrome {
	public static boolean ispalindrome(String str, int i) {
		if (i >= str.length() / 2) {
			return true;
		} else {
			return str.charAt(i) == str.charAt(str.length() - i - 1) && ispalindrome(str, i + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
//		int i = 0;
		if (ispalindrome(str, 0)) {
			System.out.println("It's Palindrome");

		} else {
			System.out.println("It's Not Palindrome");
		}

	}

}
