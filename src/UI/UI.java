package UI;

import Game.ChessBoard;
import Game.Player;

import java.util.Scanner;

public class UI {
    //attributes
    ChessBoard cb;
    //constructor
    public UI() {
        cb = new ChessBoard();
        menu();
    }

    //methods

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Player 1: ");
        String p1Name = scan.nextLine();
        Player black = new Player(p1Name, "Black");
        System.out.println("Enter Player 2: ");
        String p2Name = scan.nextLine();
        Player white = new Player(p2Name, "White");
        System.out.println(p1Name);
        cb.displayBoard();
        System.out.println(p2Name);
        System.out.println();
    }

    public void getMove(String color) {
        Scanner scan = new Scanner(System.in);
        System.out.println(color + "'s move (ex: A5 B2): ");
        String m1 = scan.next();
        String m2 = scan.next();

        String[] move = {m1, m2};
        int[] ogidx = cb.toNumIndex(m1);
        int[] endidx = cb.toNumIndex(m2);

    }
}
