package methodOverLoading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("tim", 500);
		System.out.println("new Score is " + newScore);
		calculateScore(600);
		calculateScore();

	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player Name : " + playerName + "Score : " + score);
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("unknoewn Player Scored : " + score);
		return score * 100;
	}

	public static int calculateScore() {
		System.out.println("no Player is there ");
		return 0;
	}
}
