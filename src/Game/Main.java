package Game;
public class Main {
    public static void main(String[] args) {
        ChessBoard cb = new ChessBoard();
        cb.setChessBoard();
        cb.displayBoard();
        int[] idx = {0,1};
        System.out.println(cb.checkValidity(cb, idx, idx));
        cb.displayBoard();
    }
}
