package Exception;

public class InsufficentFundException extends Exception {
	int amount;

	InsufficentFundException(int amt) {
		amount = amt;
		System.err.println("You have " + amt + " less in your Bal");

	}

}
