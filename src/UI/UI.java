package UI;

import Game.ChessBoard;
import Game.Player;

import java.util.Scanner;

public class UI {
    //attributes
    ChessBoard cb;
    //constructor
    public UI() {
        Player[] players = createPlayers();
        cb = new ChessBoard(players[0], players[1]);
        menu();
    }

    //methods

    public void menu() {
        System.out.println();
        System.out.println(cb.players[1].getName());
        cb.displayBoard();
        System.out.println(cb.players[0].getName());
    }
    public Player[] createPlayers(){
        Scanner scan = new Scanner(System.in);

        Player[] players = new Player[2];

        System.out.println("Enter player 1: ");
        String p1 = scan.nextLine();
        Player white = new Player(p1, "White");
        players[0] = white;

        System.out.println("Enter player 2: ");
        String p2 = scan.nextLine();
        Player black = new Player(p2, "Black");
        players[1] = black;

        return players;
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
