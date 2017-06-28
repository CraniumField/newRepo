//Joshua Abravanel 40008382
//COMP249
//Assignment # (1)
//January 30th, 2017

//Collection of mutators and accessors for the class Cell. This is an object that corresponds to each node
//of the game-board. It contains 3 pieces of information: the contents of a Cell (String), the owner of the
//Cell (String), and whether or not it has been called (boolean). These 3 values are used throughout the
//assignment to keep track of information. This is the basic building block of the game.

public class Cell{

	private String name = "";
	private String contents = "_";
	private String owner = "none";
	private boolean called = false;
	
	//default constructor for class Cell, with default variable values
	
	public Cell(){
		
		this.contents = "_";
		this.owner = "none";
		this.called = false;
		
	}
	
	public Cell(String s){
		
		this.name = s;
		this.contents = "_";
		this.owner = "none";
		this.called = false;
		
	}
	
	//mutators for class cell
	
	public void setName(String n){
		
		name = n;
		
	}
	public void setContents(String s){
		
		contents = s;
		
	}
	public void setOwner(String s){
		
		owner = s;
		
	}
	public void setCalled(boolean b){
		
		called = b;
		
	}
	
	//accessors for class cell
	
	public String setName(){
		
		return name;
		
	}
	public String getContents(){
		
		return contents;
		
	}
	public String getOwner(){
		
		return owner;
		
	}
	public boolean getCalled(){
		
		return called;
		
	}
	
}