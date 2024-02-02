package method;

public class gameOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		if ( score <5000) {
			System.out.println("it's not good score ");
			}else 
			{
				System.out.println("it's good score ");
			}
		if (score > 2500 && score < 5000) {
			System.out.println("it's normal score ");
		}else {
			System.out.println("it's good score ");
		}

	}

}
