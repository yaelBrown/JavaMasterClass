public class OverLoadingMethods {

    public static void main(String[] args) {
        int newScore = calculateScore("Yael", 500);
        System.out.println("New score is " + newScore);
        calculateScore();
        calculateScore(750);
    }



    public static int calculateScore(String playerName, int score) {
            System.out.println("Player " + playerName + " scored " + score + " points");
            return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player record " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

}
