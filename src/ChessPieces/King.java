package ChessPieces;

import Game.ChessBoard;

public class King extends ChessPiece {

    public King(String colour, ChessBoard chessBoard) {
        super(colour, "King", chessBoard);
    }

    @Override
    public ChessBoard checkValidity(int[] A1) {
        return null;
    }
}
