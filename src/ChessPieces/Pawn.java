package ChessPieces;

import Game.ChessBoard;

public class Pawn extends ChessPiece{
    public Pawn(String colour, ChessBoard chessBoard) {
        super(colour, "Pawn", chessBoard);
    }

    @Override
    public ChessBoard checkValidity(int[] A1) {
        return null;
    }
}
