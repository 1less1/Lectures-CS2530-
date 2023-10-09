package peasant_revolt;


import java.util.ArrayList;


public class ChessBoard {
    //list inside of list
    private ArrayList<ArrayList<Piece>> board = new ArrayList<>();

    public ChessBoard() {
        for (int i=0; i < 8; i++) {
            ArrayList<Piece> column = new ArrayList<>();
            board.add(column);
            addRow(i);
        }
    }

    public Piece getPiece(String location) {
        return new Pawn();

    }

    public void movePiece(String start, String end) {

    }

    // null is just empty space
    private void addRow(Integer rowNum) {
        for (int i=0; i<9; i++) {
            board.get(rowNum).add(null);
        }
    }


}
