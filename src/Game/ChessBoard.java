package Game;

import ChessPieces.*;

import java.util.ArrayList;
import java.util.Scanner;


public class ChessBoard {

    //attributes
    public ChessPiece[][] CB;
    //constructor
    public ChessBoard(Player white, Player black) {
        CB = new ChessPiece[8][8];

    }
    public void setChessBoard() {
        String b = "black";
        String w = "white";
        CB[0][0] = CB[0][7] = new Rook(b, this);
        CB[0][1] = CB[0][6] = new Knight(b, this);
        CB[0][2] = CB[0][5] = new Bishop(b, this);
        CB[0][3] = new Queen(b, this);
        CB[0][4] = new King(b, this);
        for(int i = 0; i < CB.length; i++){
            CB[1][i] = new Pawn(b, this);
            CB[6][i] = new Pawn(w, this);
        }
        CB[7][0] = CB[7][7] = new Rook(w, this);
        CB[7][1] = CB[7][6] = new Knight(w, this);
        CB[7][2] = CB[7][5] = new Bishop(w, this);
        CB[7][3] = new King(w, this);
        CB[7][4] = new Queen(w, this);

    }
    public void displayBoard(){
    	System.out.println("============BLACK===========");
        System.out.print("   ");
        for (int i = 0; i < CB.length; i++) {
            String s = Character.toString('A' + i);
            System.out.print(s + "  ");
        }
        for (int r = 0; r < CB.length; r++){
            if (r < CB.length)
                System.out.print("\n" + (r+1) + " ");
            for(int c = 0; c < CB[r].length; c++){
                if (CB[r][c] == null)
                    System.out.print("[ ]");
                else {
                    System.out.print("[" + CB[r][c].getName().charAt(0) + "]");
                }
            }
            System.out.print(" " +(r+1));
        }
        System.out.print("\n   ");
        for (int i = 0; i < CB.length; i++) {
            String s = Character.toString('A' + i);
            System.out.print(s + "  ");
        }
        System.out.print("\n");
        System.out.println("============WHITE===========");
    }
	public ChessPiece getPiece(int[] idx) {
		return CB[ idx[0] ][ idx[1] ];
	}
	private int[] toNumIndex(String cIndex) {
			int x = 0;
			if (cIndex.charAt(0) == 'B')
				x =1;
			else if (cIndex.charAt(0) == 'C')
				x =2;
			else if (cIndex.charAt(0) == 'D')
				x =3;
			else if (cIndex.charAt(0) == 'E')
				x =4;
			else if (cIndex.charAt(0) == 'F')
				x =5;
			else if (cIndex.charAt(0) == 'G')
				x =6;
			else if (cIndex.charAt(0) == 'H')
				x =7;
			int[] numericalIndex = {	x, (int)(cIndex.charAt(1))	};
		return numericalIndex;
	}
	public int[] getIndex(ChessPiece p) {
		int[] idx = null;
		for (int r = 0; r < CB.length; r++) {
			for (int c = 0; c < CB[r].length; c++) {
				if ( p.equals( CB[r][c] ) ) {
    				idx[0] = r;
    				idx[1] = c;
				}
    		}
		}
    return idx;
    }
    

}
