package javaBasic;

public class frustum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// surface area =	3.14 *(R1*R1+H(R1+R2)+R2*R2)
		
		int radius1 = 10;
		int radius2 = 15;
		int height = 20;
		double surfaceArea = 3.14 *(radius1*radius1 + height* (radius1+radius2) + radius2*radius2);
		System.out.println(surfaceArea);

	}

}
