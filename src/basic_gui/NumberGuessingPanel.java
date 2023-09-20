package basic_gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NumberGuessingPanel extends JPanel implements ActionListener{

    public NumberGuessingPanel() {
        JButton addButton = new JButton();
        JButton subtractButton = new JButton();

        JLabel currentNumberLabel = new JLabel("0");

        add(addButton);
        add(subtractButton);
        add(currentNumberLabel);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent ae)  {
        
    }
}
