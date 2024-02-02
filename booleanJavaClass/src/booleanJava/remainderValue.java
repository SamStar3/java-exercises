package booleanJava;

public class remainderValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		double myTotalValue = (myFirstValue + mySecondValue) *100.00d;
	
		System.out.println("My total Value is =" + myTotalValue);
		double theRemainder = myTotalValue % 40.00d;
		System.out.println("The Remainder Value is =" + theRemainder);
		boolean isNoRemainder = (theRemainder == 0) ? true : false ;
		System.out.println("Is no Remainder =" + isNoRemainder);
		if (!isNoRemainder) {
			System.out.println("Got Some remainder ");	
		}

	}

}
