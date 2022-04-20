package ChessPieces;

import Game.ChessBoard;

public class Bishop extends ChessPiece{


    public Bishop(String colour, ChessBoard chessBoard) {
        super(colour, "Bishop", chessBoard);

    }

    @Override
    public ChessBoard checkValidity(int[] A1) {
        return null;
    }
}
