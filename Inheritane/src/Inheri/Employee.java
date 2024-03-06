package Inheri;

class Employe {// super class , parent class
	private String name;
	private double salary;

	Employe(String n, double s) {
		name = n;
		salary = s;
	}

//	Employe() { // for avoid the manager error
//		name = " ";
//		salary =0.0;
//	}

	String getName() {
		return name;
	}

	void setName(String n) {
		name = n;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double s) {
		salary = s;
	}

	void raiseSalary(double percentage) {
		salary += salary * percentage / 100;
	}

}

class manager extends Employe {// sub class , child class
	double bonus;

	manager(String n, double s, double b) {
//		name = n;
//		salary = s;
		super(n, s);
		bonus = b;

	}

	public void setBonus(double b) {
		bonus = b;
//		salary = bonus + salary;

	}

	public double getSalary() {// override
//		salary = bonus + salary;
		return super.getSalary() + bonus;

	}

}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1 = new Employe("sam", 50000);
		e1.raiseSalary(20);

		System.out.println(e1.getSalary());

		manager m1 = new manager("revanth", 70000, 0.0);
//		m1.getSalary();
//		m1.raiseSalary(10);
		m1.setBonus(10000);
//		System.out.println(m1.getName());
		System.out.println(m1.getSalary());

	}

}
