package Inheri;

class Employe {// super class , parent class
	private String name;
	private double salary;
	private String joiningData;

	Employe(String n, double s, String j) {
		name = n;
		salary = s;
		joiningData = j;
	}

	Employe() { // for avoid the manager error
		name = " ";
		salary = 0.0;
	}

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

	String getDisplay() {
		return joiningData;

	}

	void setDisplay(String j) {
		joiningData = j;
	}

}

class manager extends Employe {// sub class , child class
	double bonus;

	manager(String n, double s, String j, double b) {
//		name = n;
//		salary = s;
		super(n, s, j);
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

	public String getDisplay() {
		return super.getDisplay();
	}

}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1 = new Employe("sam", 50000, "24/3/02");
		e1.raiseSalary(20);
//		e1.setDisplay("23");
		e1.getDisplay();

		System.out.println(e1.getSalary());

//		manager m1 = new manager("revanth", 70000, "23/3/02", 0.0);
//		m1.getSalary();
//		m1.raiseSalary(10);
//		m1.setBonus(10000);
//		System.out.println(m1.getName());
//		System.out.println(m1.getDisplay());
//		m1.getName();
//		m1.setDisplay("24/2/20");
//		System.out.println(m1.getDisplay());
		Employe e2 = new manager("revanth", 70000, "23/3/02", 0.0);// polymorphism

		Employe[] employes = new Employe[4];
		employes[0] = new Employe("saran", 70000, "12/5/390");
		employes[1] = new Employe("sarath", 30000, "25/4/3002");
		employes[2] = new Employe("sangar", 40000, "2/3/2002");
		employes[3] = new manager("sam s", 80000, "28/9/2002", 0.0);
//		employes[3] = m1;
//		manager m1 = null;
		if (employes[3] instanceof manager) {
			manager m1 = (manager) employes[3];
			m1.setBonus(10000);
		}
		manager m2;
		if (employes[2] instanceof manager) {
			m2 = (manager) employes[2];
			m2.setBonus(20000);
		}
//		m1.setBonus(10000);
		for (Employe e : employes) {
			System.out.println(e.getName() + " : " + e.getSalary());
		}

	}

}
