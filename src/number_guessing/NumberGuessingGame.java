package number_guessing;

import java.util.ArrayList;
import java.util.Random;

public class NumberGuessingGame {
    private Integer numberOfGuesses = 0;
    private final Integer numberToGuess;
    private Boolean gameOver = false;
    private NumberGuessingPlayer player;
    private ArrayList results;

    public NumberGuessingGame(Integer maxValue, NumberGuessingPlayer p) {
        results = new ArrayList<>();
        results.add("Too high");
        results.add("Correct");
        results.add("Too low");

        numberToGuess = (new Random()).nextInt(maxValue);
        player = p;
    }

    public void playGame() {
        // As long as the guesser hasn't guessed correctly,
        // keep playing rounds
        while(!gameOver) {
            playRound();
        }
    }

    public void playRound() {
        Integer playersGuess = player.getGuess();
        Integer result = checkGuess(playersGuess);
        player.shareGuessResult(result);
    }

    public Integer checkGuess(Integer guess) {
        numberOfGuesses++;
        Integer result = numberToGuess - guess;

        if(result > 0) {
            result = 1;
        } else if(result < 0) {
            result = -1;
        } else {
            gameOver = true;
        }

        System.out.println(results.get(result + 1));
        return result;
    }

    public Integer getNumberOfGuesses() {
        return numberOfGuesses;
    }
}
