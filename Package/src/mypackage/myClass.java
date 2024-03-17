package mypackage;

import otherpackage.sayHi;

public class myClass {

	public static void main(String[] argm) {
		sayHi.sayHii();
		sayHi s = new sayHi();
		double reva = s.division(15, 5);
		System.out.println(reva);
	}

}
