package basic_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicPanel extends JPanel implements ActionListener {
    private Integer pressCount = 0;
    private JLabel nameLabel = new JLabel("Andy");

    public BasicPanel() {
        //JLabel nameLabel = new JLabel("Andy");
        JButton clickButton = new JButton("Click Me");
        JButton resetButton = new JButton("Reset");

        add(nameLabel);
        add(clickButton);
        add(resetButton);

        clickButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    // This method is for one listener (the BasicPanel) but it
    // is listening to two different buttons, so I have to check
    // which button generated the event.
    @Override
    public void actionPerformed(ActionEvent ae) {
        //add(new JLabel("Button pressed"));
        if(ae.getActionCommand().equals("Click Me")) {
            pressCount++;
        } else {
            pressCount = 0;
        }

        nameLabel.setText("Press count: " + pressCount);
        revalidate();
    }
}
