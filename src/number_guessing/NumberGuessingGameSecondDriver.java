package number_guessing;

public class NumberGuessingGameSecondDriver {
    public static void main(String[] args) {

        //NumberGuessingPlayer player = new IncrementalNumberGuesser();
        //NumberGuessingPlayer player = new HumanNumberGuesser();
        NumberGuessingPlayer player = new RandomJumpingNumberGuesser();

        NumberGuessingGame game = new NumberGuessingGame(100, player);
        game.playGame();

        System.out.println("Required rounds: " + game.getNumberOfGuesses());
    }
}
