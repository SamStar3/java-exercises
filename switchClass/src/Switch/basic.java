package Switch;

public class basic {

	String month = "Jan";

	public static void isMonth(String month) {

		switch (month) {
		case "Jan", "Feb", "Mar", "Apr" -> System.out.println("1st");
//			return "1st";
		case "May", "Jun", "July", "Aug" -> System.out.println("2nd");
//			return "2nd";
		case "Sep", "Oct", "New", "Dec" -> System.out.println("3rd");
//			return "3rd";
		default -> System.out.println("Bad");

		}

//		System.out.println(month);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
		if (value == 1) {
			System.out.println("it is Number one");
		} else if (value == 2) {
			System.out.println("it is Number two");
		} else {
			System.out.println("Was not Number one and two");
		}
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

//			String month = "Jan";
			isMonth("Jan");
//			System.out.println(isMonth() + " it's ");
		}

	}

//	private static String isMonth() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
