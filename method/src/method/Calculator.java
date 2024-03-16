package method;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int count = 1; count <= 5; count++) {
			System.out.println(count);
		}
		for (int rate = 2; rate <= 10; rate += 2) {
			double interestAmount = calculatorVal(10000, rate);
			System.out.println(" 10000 at " + rate + " % Interest = " + interestAmount);
		}
		for (double i = 7.50; i <= 10; i += 0.25) {
			double interestAbt = calculatorVal(10000, i);
			if (i > 8.50) {
				break;
			}
			System.out.println("10000 at " + i + " % Interest = " + interestAbt);
		}
//		System.out.println("10,000 at 2 % Interest = " + calculatorVal(10000, 2));
//		System.out.println("20,000 at 3 % Interest = " + calculatorVal(20000, 3));
//		System.out.println("30,000 at 5 % Interest = " + calculatorVal(30000, 5));
//		System.out.println("50,000 at 10 % Interest = " + calculatorVal(50000, 10));
	}

	public static double calculatorVal(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
