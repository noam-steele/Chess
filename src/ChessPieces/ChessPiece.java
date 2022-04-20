package ChessPieces;


public abstract class ChessPiece{
    //attributes
	private boolean captured;
    private String colour;
    private String name;
    private char X;
    private int Y;

    //constructor
    ChessPiece(String colour, String name) {
        this.colour = colour;
        this.name = name;
        this.captured = false;
    }
    //methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getX() {
        return X;
    }
    public void setX(char x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
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
