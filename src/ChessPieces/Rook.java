package ChessPieces;

import Game.ChessBoard;

public class Rook extends ChessPiece{



    public Rook(String colour, ChessBoard chessBoard) {
        super(colour, "Rook", chessBoard);
    }

    @Override
    public ChessBoard checkValidity(int[] A1) {
        return null;
    }
}
