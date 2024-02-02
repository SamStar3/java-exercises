package dsabasis;

public class isPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNum = 26;
		for (int i =2; i<=givenNum;i++) {
			if (i%2!=0&&i%3!=0&&i%5!=0) {
				
				System.out.println(i);    
			}
		}

	}

	
}
