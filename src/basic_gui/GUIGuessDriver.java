package basic_gui;

import number_guessing.NumberGuessingGame;

public class GUIGuessDriver {
    public static void main(String[] args) {
        NumberGuessingGame ngg = new NumberGuessingGame(100,
                //new RandomJumpingNumberGuesser());
                //new HumanNumberGuesser());
                new GUIGuessPlayer());
        ngg.playGame();
    }
}
