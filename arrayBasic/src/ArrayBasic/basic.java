package ArrayBasic;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = { 53, 43, 64, 34, 23 };
		System.out.println(marks[4]);
		int mark[][] = new int[3][5];
		mark[1][2] = 53;
		mark[2][1] = 55;
		System.out.println(mark[2][1]);
		int mar[][] = { { 2, 3, 4, 5 }, { 6, 5, 4, 3 }, { 8, 7, 5, 4 } };
		System.out.println(mar[2][2]);
		System.out.println(marks[2] + ", " + marks[marks.length - 1]);
		System.out.println(marks[0] + ", " + marks[4]);
		marks[2] = 50;
		System.out.println(marks[2]);
		int temp = marks[0];
		marks[0] = marks[4];
		marks[4] = temp;
		System.out.println(marks[0] + ", " + marks[4]);
		for (int i = 0; i < marks.length - 1; i++) {
			System.out.println(marks[i]);
		}

	}

}
