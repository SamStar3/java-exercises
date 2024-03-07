package Inheri;

public class BirdinAnimal {

	static class Animal {
		private void walk() {
			System.out.println("I am walking");
		}

	}

	static class Bird extends Animal {
		void fly() {
			System.out.println("I am flying");
		}

		void sing() {
			System.out.println("I am singing");
		}

		void walk() { // override
			super.walk();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.walk();

		bird.fly();
		bird.sing();
		Animal animal = new Animal();
		animal.walk();
//		animal.fly();

	}

}
