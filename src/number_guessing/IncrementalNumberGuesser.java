package number_guessing;

public class IncrementalNumberGuesser implements NumberGuessingPlayer {
    private Integer nextGuess = 0;

    @Override
    public Integer getGuess() {
        return nextGuess;
    }

    @Override
    public void shareGuessResult(Integer result) {
        nextGuess = nextGuess + 1;
    }
}
