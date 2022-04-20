package ChessPieces;


import Game.ChessBoard;

public abstract class ChessPiece {
    //attributes
    private ChessBoard cb;
	private boolean captured;
    private String colour;
    private String name;
    private int x;
    private int y;

    //constructor
    ChessPiece(String colour, String name, ChessBoard cb) {
        this.cb = cb;
        this.colour = colour;
        this.name = name;
        this.captured = false;
    }
        
    //methods
    public abstract ChessBoard checkValidity(int [] A1);

    //setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getX() {
        return x;
    }
    public void setX(char x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean getCaptured() {
    	return this.captured;
    }
    public void setCaptured(Boolean captured) {
    	this.captured = captured;
    }
}
