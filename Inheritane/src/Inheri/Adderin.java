package Inheri;

class Arithmetic {
	int add(int a, int b) {
		return a + b;
	}
}

class adder extends Arithmetic {

}

public class Adderin {

	public static void main(String[] args) {

		adder a = new adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");

	}

}
