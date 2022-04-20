package Game;

import ChessPieces.*;

import java.util.ArrayList;
import java.util.Scanner;


public class ChessBoard {

    //attributes
    public ChessPiece[][] CB;
    public Player[] players;
    //constructor
    public ChessBoard(Player white, Player black) {
        players = new Player[2];
        CB = new ChessPiece[8][8];
        setChessBoard();
        this.players[0] = white;
        this.players[1] = black;

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
	public int[] toNumIndex(String cIndex) {
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
    public ChessPiece[][] movePiece(String[] stringMove){
        //translate string index to numerical index
        int[] ogIdx = toNumIndex(stringMove[0]);
        int[] destIdx = toNumIndex(stringMove[1]);

        //check piece type and call helper method
        ChessPiece[][] curr;
        if (getPiece(ogIdx) instanceof Pawn) {
            curr = movePawn(ogIdx, destIdx);
        } else if (getPiece(ogIdx) instanceof Rook){

        } else if (getPiece(ogIdx) instanceof Knight){

        } else if (getPiece(ogIdx) instanceof Bishop) {

        } else if (getPiece(ogIdx) instanceof Queen) {

        } else if (getPiece(ogIdx) instanceof King) {

        }
        return null;
    }

    private ChessPiece[][] movePawn(int[] ogIdx, int[] destIdx) {
        ChessPiece cp = getPiece(ogIdx);
        boolean valid = false;
        //if piece is white
        if (cp.getColour().equals("white")){
            //if pawn has not moved
            if (cp.getMoveCount() == 0) {
                //pawn can move straight forward one or two spaces
                if (destIdx[1] == ogIdx[1] && (destIdx[0] == ogIdx[0]+1 || destIdx[0] == ogIdx[0]+2)){
                    //route to destination must be empty
                    for(int i = ogIdx[0]; i <= destIdx[0]; i++) {
                        if (CB[destIdx[1]][i] != null){
                            valid = true;
                        }
                    }
                }
            //if pawn has moved
            } else {
                //pawn can move forward one spot if the spot is empty
                if (destIdx[1] == ogIdx[1] && destIdx[0] == ogIdx[0]+1 && CB[ogIdx[1]][ogIdx[0] + 1] == null){
                    valid = true;
                //pawn can move forward diagonally one spot if the spot is not empty
                } else if ((destIdx[1] == ogIdx[1]+1 || destIdx[1] == ogIdx[1]-1) && (destIdx[0] == ogIdx[0]+1) && CB[destIdx[1]][destIdx[0]].getColour().equals("black")){
                    valid = true;
                }
            }
        //if piece is black
        } else{

        }


        if (valid == true){
            CB[destIdx[1]][destIdx[0]] = cp;
            CB[ogIdx[1]][ogIdx[0]] = null;
        } else {
            System.out.println("Invalid move");
        }
        return null;
    }

}
