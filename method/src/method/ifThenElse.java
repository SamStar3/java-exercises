package method;

public class ifThenElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver = true ;
		int score = 900;
		int bonus = 100;
		int levelCompleted = 5;
		int finalscore = score;
		int highscore = nested(gameOver,score,levelCompleted,bonus );
		System.out.println("the highscroe is " + highscore);
		System.out.println("The highscore is " +
		nested(gameOver,score, levelCompleted,bonus));
//		if (gameOver == true) {
//			finalscore += bonus * levelCompleted;
//			System.out.println("your total score is = " + finalscore);
//		}

	}
	public static int nested(boolean gameOver,int score, int bonus, int levelCompleted) {
		int finalScore = score;
		if (gameOver ==true) {
			finalScore += bonus *levelCompleted;
			System.out.println("your total score is = " + finalScore);
		}
		return finalScore;
		
	}
}
