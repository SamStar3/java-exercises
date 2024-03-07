package DSA;

public class HanoiDSA {

	static void towerOfHonai(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 0) {
			return;
		}
		towerOfHonai(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " From rod " + from_rod + " To rod " + to_rod);
		towerOfHonai(n - 1, aux_rod, to_rod, from_rod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		towerOfHonai(n, 'A', 'C', 'B');

	}

}
