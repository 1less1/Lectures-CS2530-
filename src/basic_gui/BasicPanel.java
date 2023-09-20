package basic_gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BasicPanel extends JPanel implements ActionListener{

    private Integer pressCount=0; // Instance variable

    private JLabel nameLabel = new JLabel("Andy");
    public  BasicPanel() {
        JButton clickButton = new JButton("Click Me");
        JButton resetButton = new JButton("Reset");

        add(nameLabel);
        add(clickButton);
        add(resetButton);

        clickButton.addActionListener(this);
        resetButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        // This if-else is looking at one action listener (the click me button) and
        // sets the other button to the opposite action.
        if (ae.getActionCommand().equals("Click Me")) {
            pressCount++;
        } else {
            pressCount=0;
        }


        //add(new JLabel("Button Pressed"));
        nameLabel.setText("Press count: " + pressCount);
        revalidate();
    }


}
