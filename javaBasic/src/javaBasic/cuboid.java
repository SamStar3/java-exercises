package javaBasic;

public class cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//total surface area = 2(lb+bh+hl) 
		
		int length = 10;
		int breadth = 15;
		int height = 20;
		int totalSurfaceArea = 2*(length*breadth + breadth*height +height*length);
		System.out.println(totalSurfaceArea);

	}

}
