package number_guessing;

import java.util.Scanner;

public class HumanNumberGuesser implements NumberGuessingPlayer {
    private Scanner reader = new Scanner(System.in);
    @Override
    public Integer getGuess() {
        System.out.println("What is your guess?");
        return reader.nextInt();
    }

    @Override
    public void shareGuessResult(Integer result) {
        System.out.println("Your guess result was " + result);
    }
}
