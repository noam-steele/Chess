package ChessPieces;

import Game.ChessBoard;

public class Queen extends ChessPiece{
    public Queen(String colour, ChessBoard chessBoard) {
        super(colour, "Queen", chessBoard);
    }

    @Override
    public ChessBoard checkValidity(int[] A1) {
        return null;
    }
}
