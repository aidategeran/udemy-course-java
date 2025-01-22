package Section6;

import java.util.Random;

public class GuessItLoop {
    public static void main(String[] args) {
        int randomNum = new Random ().nextInt(10)+1;
        String guessedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
        int guessedNum = Integer.parseInt(guessedNumText);
        if (guessedNum == randomNum) {
            System.out.printf("The random number was %d. You got it!%n", randomNum);
            return;
        } else {
            System.out.println("You didn't get it");
        }

    }
}
