package Interface;

interface Ridable {
	void ride();
}

class Car implements Ridable {
	public void ride() {
		System.out.println("Ride with Car ");
	}
}

class Bike implements Ridable {
	public void ride() {
		System.out.println("Ride with Bike ");
	}
}

class Mechine {
	void Checking(Ridable r) {
		System.out.println("The Mechine is Checking... ");
		r.ride();
	}
}

public class vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechine m = new Mechine();
		Car c = new Car();
		Bike b = new Bike();
		m.Checking(b);
		m.Checking(c);

	}

}
