package Section6;

import java.util.Random;

public class GuessItLoop {

    public static final int MAX_ALLOWED_TRIED = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("The random number is %d%n", randomNum);
        String guessedNumText = null;
        int wrongGuessCount = 1;

//        while (!"q".equals(guessedNumText)) {
//            guessedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
//
//            if (guessedNumText.matches("-?\\d{1,3}")) {
//                int guessedNum = Integer.parseInt(guessedNumText);
//                if (guessedNum == randomNum) {
//                    System.out.printf("The random number was %d. You got it!%n", randomNum);
//                    return;
//                } else {
//                    System.out.println("You didn't get it");
//                }
//            }
//        }
//        do {
        for (; wrongGuessCount <= MAX_ALLOWED_TRIED; wrongGuessCount++) {
            guessedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");

            if (guessedNumText.matches("-?\\d{1,3}")) {
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, wrongGuessCount, tryText);
                    break;
                } else {
                    System.out.println("You didn't get it");
                }
            }
        }
//        } while (!"q".equals(guessedNumText) && wrongGuessCount <= MAX_ALLOWED_TRIED);
        if (wrongGuessCount >= MAX_ALLOWED_TRIED) {
            System.out.printf("You've had %d incorrect guesses. The random number is %d. You ending now!%n", wrongGuessCount, randomNum);
        }
    }

}
