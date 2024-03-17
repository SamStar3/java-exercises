package method;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int j = 0; j <= 50; j++) {
			if (isPrime(j)) {
				System.out.println("Number " + j + " is Prime Number");
				count++;
			}
		}
		System.out.println("Total Number of Prime Numbera between 0 to 50 is " + count);

//		System.out.println("0 is " + (isPrime(0) ? "" : " Not ") + "a Prime Number");
//		System.out.println("1 is " + (isPrime(1) ? "" : " Not ") + "a Prime Number");
//		System.out.println("2 is " + (isPrime(2) ? "" : " Not ") + "a Prime Number");
//		System.out.println("8 is " + (isPrime(8) ? "" : " Not ") + "a Prime Number");
//		System.out.println("17 is " + (isPrime(17) ? "" : " Not ") + "a Prime Number");

	}

	public static boolean isPrime(int wholeNum) {
		if (wholeNum <= 2) {
			return (wholeNum == 2);
		}
		for (int i = 2; i < wholeNum; i++) {
			if (wholeNum % i == 0) {
				return false;
			}
		}
		return true;
	}

}
