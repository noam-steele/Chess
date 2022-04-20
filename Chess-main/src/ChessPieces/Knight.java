package ChessPieces;

import Game.ChessBoard;

public class Knight extends ChessPiece{
    public Knight(String colour, ChessBoard chessBoard) {
        super(colour, "Knight", chessBoard);
    }

    @Override
    public ChessBoard checkValidity(int[] A1) {
        return null;
    }
}
