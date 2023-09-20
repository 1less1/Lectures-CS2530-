package number_guessing;

import java.util.Scanner;

public class NumberGuessingGameFirstDriver {
    public static void main(String[] args) {
        NumberGuessingGame ngg = new NumberGuessingGame(Integer.parseInt(args[0]), null);
        Scanner userInputScanner = new Scanner(System.in);
        Integer result = -1;

        while(result != 0) {
            System.out.println("Make a guess:");
            result = ngg.checkGuess(userInputScanner.nextInt());
            System.out.println("Result: " + result);
        }

        System.out.println("Correct!");
    }
}
