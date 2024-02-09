package stringLearning;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String a = "aieou";
		int vowel = 0;
		int con = 0;
//		System.out.println(a.contains(str));
		for (int i =0;i<str.length();i++) {
			if (a.contains(String.valueOf(str.charAt(i)))) {
				vowel++;
			}else {
				con++;
			}
		}
		System.out.println("vowel = "+vowel);
		System.out.println("consonant = "+con);
		

	}

}
