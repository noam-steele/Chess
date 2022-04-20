package Game;

public class Player {

	//attributes
	private String name;
	private String colour;
	
	//constructor
	Player(String name, String colour){
		this.name = name;
		this.colour = colour;
	}
	//methods
	public String getName() {
		return this.name;
	}
	public String getColour() {
		return this.colour;
	}
}
