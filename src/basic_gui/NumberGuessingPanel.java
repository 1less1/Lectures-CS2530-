package basic_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessingPanel extends JPanel implements ActionListener {
    private JLabel currentNumberLabel;
    private Integer count = 0;

    public NumberGuessingPanel() {
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton halveButton = new JButton("Halve");
        JButton doubleButton = new JButton("Double");

        currentNumberLabel = new JLabel("0");

        add(halveButton);
        add(subtractButton);
        add(currentNumberLabel);
        add(addButton);
        add(doubleButton);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        halveButton.addActionListener(this);
        doubleButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Check to see which ActionCommand generated the ActionEvent --
        // was it '+' or was it '-'?
        if(ae.getActionCommand().equals("+")) {
            // Increment the number by one
            count++;
        } else if(ae.getActionCommand().equals("-")) {
            count--;
        } else if(ae.getActionCommand().equals("Halve")) {
            count = count / 2;
        } else if(ae.getActionCommand().equals("Double")) {
            count = count * 2;
        }

        currentNumberLabel.setText("" + count);
        revalidate();
    }

    public Integer getCount() {
        return count;
    }
}
