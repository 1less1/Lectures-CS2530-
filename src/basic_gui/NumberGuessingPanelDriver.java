package basic_gui;

import javax.swing.*;

public class NumberGuessingPanelDriver {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Number Guessing Panel");
        jf.add(new NumberGuessingPanel());
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setVisible(true);
    }
}
