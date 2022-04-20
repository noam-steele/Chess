package Game;

public interface PieceMovement {
	public abstract ChessBoard movePiece(ChessBoard cb, String cIndex, String dIndex) ;
	public abstract Boolean checkValidity(ChessBoard cb, int[] cIndex, int[] dIndex);
}
