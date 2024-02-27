package Switch;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
//		if (value == 1) {
//			System.out.println("it is Number one");
//		} else if (value == 2) {
//			System.out.println("it is Number two");
//		} else {
//			System.out.println("Was not Number one and two");
//		}
		switch (value) {
		case 1:
			System.out.println("It was one");
			break;
		case 2:
			System.out.println("It was two");
			break;
		case 3:
			System.out.println("it was three");
			break;
		default:
			System.out.println("Invalid");

		}

	}

}
