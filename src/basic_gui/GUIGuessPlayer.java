package basic_gui;

import number_guessing.NumberGuessingPlayer;

import javax.swing.*;

public class GUIGuessPlayer implements NumberGuessingPlayer {
    @Override
    public Integer getGuess() {
        NumberGuessingPanel guessPanel = new NumberGuessingPanel();


        /* JFrame guessFrame = new JFrame("Make a Guess!");
        guessFrame.add(guessPanel);
        guessFrame.setSize(300,300);
        guessFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        guessFrame.setVisible(true);

        return guessPanel.getCount();

         */

        JDialog guessDialog = new JDialog();
        guessDialog.add(new NumberGuessingPanel());
        guessDialog.setSize(300,300);
        guessDialog.setModal(true);
        guessDialog.setVisible(true);

        return guessPanel.getCount();
    }

    @Override
    public void shareGuessResult(Integer result) {
        System.out.println("Your guess result was: " + result);
    }
}
