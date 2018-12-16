/*
    Section 4: Expressions, Statments, Code Blocks, Methods and mode.
 */

public class ExpStateMethods {

    // "psvm" is shortcut for public static void main

    // "void" does not return anything.

    // main method (where the application runs)
    public static void main(String[] args) {

        // Declare variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("some code");

        // call the newly created method.
        //calculateScore();

        // make changes to variables already declared
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // run the expression again
        if(gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalscore);
        }


        calculateScore(true, 800, 6, 200);

        // print results of challenge
        displayHighScorePosition("steve", 7);
        calculateHighScorePosition(1500);
        calculateHighScorePosition(900);
        calculateHighScorePosition(400);
        calculateHighScorePosition(50);

    }

    // A new method (with defined parameters)
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // declare variables
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        // calculate score
        if(gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalscore);
        }

        // return statement goes back, no further lines after that point will be processed.
        // return -1;

        // returning -1 in programming terms generally indicates a error.
        // in searching terms it would indicate invalid value, or value not found.
    }

    // challenge
    public static void displayHighScorePosition(String name, int pos) {
        String playersName = name;
        int position = pos;

        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScoreCalc;

        // use greater than or equal to. To prevent a score of 1000 being referred to as posititon 4.
        if (playerScore >= 1000) {
            highScoreCalc = 1;
        } else if (playerScore >= 500) {
            highScoreCalc = 2;
        } else if (playerScore >= 100) {
            highScoreCalc = 3;
        } else {
            highScoreCalc = 4;
        }

        return highScoreCalc;
    }

}
