package ArrayBasic;

public class removing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = { 5, 4, 3, 6, 2, 4 };
		int deleteValue = 3;
		int k = 0;
		int newMarks[] = new int[marks.length - 1];
		for (int i = 0; i < marks.length; i++) {
			if (deleteValue != marks[i]) {
				newMarks[k] = marks[i];
				k++;
			}
		}
		for (int j = 0; j < newMarks.length; j++)
			System.out.println(newMarks[j]);

	}

}
