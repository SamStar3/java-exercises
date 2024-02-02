package method;

public class methodChallenge {

	public static void main(String[] args, int playerscore, String playerName) {
		// TODO Auto-generated method stub
		
		int highscorePosition = calculateHighscorePosition(playerscore=1500);
		displayHighscorePosition(playerName = "Sam", highscorePosition);

	}
	public static void displayHighscorePosition(String playerName, int highscorePosition) {
		System.out.println(playerName + "managed to into position " + highscorePosition + "on the highscore lish ");
		
	}
	public static int calculateHighscorePosition(int playerscore) {
		if (playerscore>=1000) {
			return 1;
		}else if(playerscore >=500 && playerscore <1000) {
			return 2;
		}else if (playerscore >=100 && playerscore <500) {
		    return 3;
		}else {
			return 4;
		}
	}
}
