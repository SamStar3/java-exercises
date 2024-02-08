package stringLearning;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sam Soundara Pandian";
		char first = (s.charAt(1));
		int count = 0;
		for (int i=1;i<=s.length()-1;i++) {
			if (first==s.charAt(i)) 
			count++;
			
		}
		System.out.println(count);

	}

}
