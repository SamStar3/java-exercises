package Exception;

public class Found {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bal = 500;
		int withdraw = 700;
		try {
			if (bal < withdraw) {
				throw new InsufficentFundException(withdraw - bal);
			}
		} catch (InsufficentFundException e) {
			System.out.println("Not enough Money " + e.getMessage());
		}

	}

}
