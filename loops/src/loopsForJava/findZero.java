package loopsForJava;

public class findZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "0";
		String num2 = "0";
		String num3 = "0";
		String str = "";
		System.out.println(num1+num2+num3);
		for(int i = 0; i <= 2; i++)
		{
			
			String xxx = String.valueOf(i);
			num3 = xxx;
			System.out.println(num1+num2+num3);
			num2 = xxx;
			System.out.println(num1+num2+num3);
			num1 = xxx;
			System.out.println(num1+num2+num3);

			
//			System.out.println();
		}
		

	}

}
