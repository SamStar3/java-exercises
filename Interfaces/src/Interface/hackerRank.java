package Interface;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		if (n <= 1) {
			return n;
		}
		int res = n + 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				res += i;
			}
		}
		return res;
	}
}

public class hackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}

	}

}
