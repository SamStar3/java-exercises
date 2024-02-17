package dsabasis;

public class bitwise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte n = 4;
//		about << 
		System.out.println(n << 1);
		System.out.println(n << 2);
		System.out.println((byte) n << 28);
//		about >> 
		System.out.println(n >> 1);
		int a = -5;
		System.out.println("right shift = " + (a >> 1));
		System.out.println("right shift with zero = " + (a >>> 1));

	}

}
