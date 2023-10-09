package peasant_revolt;

import javax.swing.*;
import java.awt.*;

public class ChessBoardPanel extends JPanel {

    private ChessBoard board;

    public ChessBoardPanel(ChessBoard cb) {
        board = cb;

        setLayout(new GridLayout(8, 8));

        for (int i=0; i<64; i++) {


            //add(new JLabel(""+i));
            /*
            // Example of how you can get multiple elements inside the same square
            // by putting them on the same JPanel and then adding the JPanel to the chess board.
            JPanel jp = new JPanel();
            jp.add(new JLabel(""+i));
            jp.add(new JLabel("" + (i*20)));
            add(jp);

             */
        }

    }

    private class ChessBoardPanelSquare extends JPanel {


    }


}


