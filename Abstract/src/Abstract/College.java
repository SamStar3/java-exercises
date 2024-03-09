package Abstract;

abstract class member {
	String name;

	abstract void welcomeMessage();
}

class student extends member {
	void welcomeMessage() {
		System.out.println("Welcome Student...");
	}
}

class teacher extends member {
	void welcomeMessage() {
		System.out.println("Welcome Teacher...");
	}
}

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member[] m1 = new member[4];
		m1[0] = new student();
		m1[1] = new teacher();
		m1[2] = new student();
		m1[3] = new teacher();
		for (member m : m1) {
			m.welcomeMessage();
		}

	}

}
