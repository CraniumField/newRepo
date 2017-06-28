//Joshua Abravanel 40008382
//COMP249
//Assignment # (1)
//January 30th, 2017

//The driver class, simply creates an instance of class Game-board and runs all the methods.

public class Main {

	public static void main (String [] args){
		
		Gameboard gameboard = new Gameboard();
		
		gameboard.fillGrid();
		gameboard.Placements();
		gameboard.computerPlacements();
		gameboard.playGame();
		
	}
	
}