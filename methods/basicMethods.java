class Main {
	public static void main(String[] args) {

		int highScorePosition = calculateHighScorePosition(400);
		displayhighScorePosition("Griffith", highScorePosition)

	}

	public static int calculateHighScorePosition(int score) {

		if (score >= 1000) {
			return 1;
		} else if (score >= 500 && score < 1000) {
			return 2;
		} else if (score >= 100 && score < 500) {
			return 3;
		}

		return 4;

	}

	public static void displayhighScorePosition(String playerName, int playerScore) {
		String output = "Player " + playerName + " managed to score ",  + playerScore;
		print(output);
	}

	public static void print(String output) {
		System.out.println(output);
	}
}