package Abstract;

abstract class shapes {
	abstract void Area(int a);
}

class sqaure extends shapes {
	void Area(int a) {
		System.out.println("Sqaure : " + a * 4);
	}
}

class triangle extends shapes {
	void Area(int a) {
		System.out.println("Triangle : " + a * 3);
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapes[] s = new shapes[2];
		s[0] = new sqaure();
		s[1] = new triangle();
		for (shapes s1 : s) {
			s1.Area(4);
		}

	}

}
