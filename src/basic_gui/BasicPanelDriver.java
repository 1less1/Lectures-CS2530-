package basic_gui;

import javax.swing.*;
import java.awt.*;

public class BasicPanelDriver {

    public static void main(String[] args) {

        JFrame jf = new JFrame("Basic Demo");
        jf.setLayout(new FlowLayout());
        jf.add(new BasicPanel());
        jf.add(new BasicPanel(), BorderLayout.NORTH);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,600);

        jf.setVisible(true);


    }
}
