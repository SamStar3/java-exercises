package Switch;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDayOfWeek(0);
		printDayOfWeek(1);
		printDayOfWeek(2);
		printDayOfWeek(3);
		printDayOfWeek(4);
		printDayOfWeek(5);
		printDayOfWeek(6);
		printDayOfWeek(7);

	}

	public static void printDayOfWeek(int day) {

		String dayOfWeek = switch (day) {
		case 0 -> {
			yield "Sunday";
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Tursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid";
		};
		System.out.println(day + " Stands for " + dayOfWeek);

	}

}
