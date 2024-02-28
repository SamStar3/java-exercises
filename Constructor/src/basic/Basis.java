package basic;

public class Basis {

	int rollNo;
	int mark;

	Basis(int rollNo, int mark) {
		System.out.println("defult");
		this.rollNo = rollNo;
		this.mark = mark;

	}

	void display() {
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basis std = new Basis(33, 59);
		System.out.println(std.rollNo);
		System.out.println(std.mark);
		std.display();
		std.display();
		std.display();
		std.display();

	}

}
