//Joshua Abravanel 40008382
//COMP249
//Assignment # (1)
//January 30th, 2017

import java.util.Scanner;
import java.util.Random;

//Where all the main methods of the assignment can be found. This is the Game-board class where all actions take place.
//First the game-board is created as a 2d array, then filled with cells, then these cells are modified using Method fillGrid() to
//match the desired outlook of the board. (1st row becomes A-H, first column becomes 1-8, with (0,0) blank) by default all cells are "_".
//Method Placements() allows the user to place 6 ships and 4 grenades as they please, so long as they are valid chars and ints for the board.
//Method computerPlacements() automatically generates locations for the placement of 6 ships and 4 grenades. Only valid locations may be chosen
//Method playGame() is where actual game-play takes place. Human chooses a position, that must be valid. If a grenade is hit, a turn is skipped
//for the player that hit it. The computer then randomly takes a turn. This goes on until 1 player has sunk 6 ships, and is declared the winner.
//Revealed game-board and the number of missed turns for both players are then displayed.

public class Gameboard {
	
	//Initializing essential grid
	
//	Cell [][] grid = new Cell [9][9];
	
	Cell c0 = new Cell();
	Cell c1 = new Cell();
	Cell c2 = new Cell();
	Cell c3 = new Cell();
	Cell c4 = new Cell();
	Cell c5 = new Cell();
	Cell c6 = new Cell();
	Cell c7 = new Cell();
	Cell c8 = new Cell();
	Cell c9 = new Cell();
	Cell c10 = new Cell();
	Cell c11 = new Cell();
	Cell c12 = new Cell();
	Cell c13 = new Cell();
	Cell c14 = new Cell();
	Cell c15 = new Cell();
	Cell c16 = new Cell();
	Cell c17 = new Cell();
	Cell c18 = new Cell();
	Cell c19 = new Cell();
	Cell c20 = new Cell();
	Cell c21 = new Cell();
	Cell c22 = new Cell();
	Cell c23 = new Cell();
	Cell c24 = new Cell();
	Cell c25 = new Cell();
	Cell c26 = new Cell();
	Cell c27 = new Cell();
	Cell c28 = new Cell();
	Cell c29 = new Cell();
	Cell c30 = new Cell();
	Cell c31 = new Cell();
	Cell c32 = new Cell();
	Cell c33 = new Cell();
	Cell c34 = new Cell();
	Cell c35 = new Cell();
	Cell c36 = new Cell();
	Cell c37 = new Cell();
	Cell c38 = new Cell();
	Cell c39 = new Cell();
	Cell c40 = new Cell();
	Cell c41 = new Cell();
	Cell c42 = new Cell();
	Cell c43 = new Cell();
	Cell c44 = new Cell();
	Cell c45 = new Cell();
	Cell c46 = new Cell();
	Cell c47 = new Cell();
	Cell c48 = new Cell();
	Cell c49 = new Cell();
	Cell c50 = new Cell();
	Cell c51 = new Cell();
	Cell c52 = new Cell();
	Cell c53 = new Cell();
	Cell c54 = new Cell();
	Cell c55 = new Cell();
	Cell c56 = new Cell();
	Cell c57 = new Cell();
	Cell c58 = new Cell();
	Cell c59 = new Cell();
	Cell c60 = new Cell();
	Cell c61 = new Cell();
	Cell c62 = new Cell();
	Cell c63 = new Cell();
	Cell c64 = new Cell();
	Cell c65 = new Cell();
	Cell c66 = new Cell();
	Cell c67 = new Cell();
	Cell c68 = new Cell();
	Cell c69 = new Cell();
	Cell c70 = new Cell();
	Cell c71 = new Cell();
	Cell c72 = new Cell();
	Cell c73 = new Cell();
	Cell c74 = new Cell();
	Cell c75 = new Cell();
	Cell c76 = new Cell();
	Cell c77 = new Cell();
	Cell c78 = new Cell();
	Cell c79 = new Cell();
	Cell c80 = new Cell();
	
	//Filling grid with cells
	
	Cell [][] grid = {
		{c0,c1,c2,c3,c4,c5,c6,c7,c8},
		{c9,c10,c11,c12,c13,c14,c15,c16,c17},
		{c18,c19,c20,c21,c22,c23,c24,c25,c26},
		{c27,c28,c29,c30,c31,c32,c33,c34,c35},
		{c36,c37,c38,c39,c40,c41,c42,c43,c44},
		{c45,c46,c47,c48,c49,c50,c51,c52,c53},
		{c54,c55,c56,c57,c58,c59,c60,c61,c62},
		{c63,c64,c65,c66,c67,c68,c69,c70,c71},
		{c72,c73,c74,c75,c76,c77,c78,c79,c80},
	};
	
	//initializing variables
	
	//rows and columns of grid
	
	int rows = 0;
	int columns = 0;
	
	//counters for placements
	
	int shipsCounter = 0;
	int grenadesCounter = 0;
	
	int shipsCounterComp = 0;
	int grenadesCounterComp = 0;
	
	//Tracks total number of missed turns for both
	
	int missedTurnsHuman = 0;
	int missedTurnsComp = 0;
	
	//Is used to keep track of when to skip turns
	
	int turnHolderHuman = 0;
	int turnHolderComp = 0;
	
	//Strings that are used to simplify the Placements() method
	
	String printer = "";
	String number = "";
	String input = "";
	String letter = "";
	String visibleBoard = "";
	
	//booleans used to navigate the Placements() method
	
	boolean Errors = false;
	boolean repeat = false;
	boolean skip = false;
	
	//initializing Scanner to read input from user
	
	Scanner scan = new Scanner(System.in);
	
	//initializing Random to generate computer choices
	
	Random rand = new Random();
	
	//Method that fills the grid according to the desired layout
	
	public void fillGrid(){
		

//		for (int a = 0; a < 9; a++){
//			
//			for (int b = 9; b < 9; b++){
//
//				grid [a][b] = new Cell();
//				
//			}
//			
//		}
		
//		c0.setContents(" ");
//		c1.setContents("A");
//		c2.setContents("B");
//		c3.setContents("C");
//		c4.setContents("D");
//		c5.setContents("E");
//		c6.setContents("F");
//		c7.setContents("G");
//		c8.setContents("H");
//		
//		c9.setContents("1");
//		c18.setContents("2");
//		c27.setContents("3");
//		c36.setContents("4");
//		c45.setContents("5");
//		c54.setContents("6");
//		c63.setContents("7");
//		c72.setContents("8");
		
		grid[0][0].setContents(" ");
		
		grid[0][1].setContents("A");
		grid[0][2].setContents("B");
		grid[0][3].setContents("C");
		grid[0][4].setContents("D");
		grid[0][5].setContents("E");
		grid[0][6].setContents("F");
		grid[0][7].setContents("G");
		grid[0][8].setContents("H");
		
		grid[1][0].setContents("1");
		grid[2][0].setContents("2");
		grid[3][0].setContents("3");
		grid[4][0].setContents("4");
		grid[5][0].setContents("5");
		grid[6][0].setContents("6");
		grid[7][0].setContents("7");
		grid[8][0].setContents("8");
		
		//Setting these basic blocks of the board to true simply to allow them to be displayed when it is game time.
		
//		c0.setCalled(true);
//		c1.setCalled(true);;
//		c2.setCalled(true);;
//		c3.setCalled(true);;
//		c4.setCalled(true);;
//		c5.setCalled(true);;
//		c6.setCalled(true);;
//		c7.setCalled(true);;
//		c8.setCalled(true);;
//		
//		c9.setCalled(true);;
//		c18.setCalled(true);;
//		c27.setCalled(true);;
//		c36.setCalled(true);;
//		c45.setCalled(true);;
//		c54.setCalled(true);;
//		c63.setCalled(true);;
//		c72.setCalled(true);;
		
		grid[0][0].setCalled(true);
		
		grid[0][1].setCalled(true);
		grid[0][2].setCalled(true);
		grid[0][3].setCalled(true);
		grid[0][4].setCalled(true);
		grid[0][5].setCalled(true);
		grid[0][6].setCalled(true);
		grid[0][7].setCalled(true);
		grid[0][8].setCalled(true);
		
		grid[1][0].setCalled(true);
		grid[2][0].setCalled(true);
		grid[3][0].setCalled(true);
		grid[4][0].setCalled(true);
		grid[5][0].setCalled(true);
		grid[6][0].setCalled(true);
		grid[7][0].setCalled(true);
		grid[8][0].setCalled(true);
		
		
	}
	
	//Allows for user to place battleships and grenades
	
	public void Placements(){
		
		//repeat performs the function until the board is ready
		
		repeat = false;
		while (repeat == false){
			
			//Re-does the loop if the human makes a mistake with the location
			
			skip = false;
			Errors = false;
			while (Errors == false){
			
				System.out.println();
				
				//displaying correct placement statement
				
				if (shipsCounter < 6){
					
					System.out.print("Please select a place on the Grid for 1 of 6 ships: ");
					
				}
				
				if (shipsCounter == 6){
					
					System.out.print("Please select a place on the Grid for 1 of 4 grenades: ");
					
				}
			
				input = scan.nextLine();
			
				letter = input.substring(0,1).toUpperCase();
				number = input.substring(1,2);
				
				//Checking to ensure letter is in bounds of grid
				
				if (letter.equals("A")|letter.equals("B")||letter.equals("C")||letter.equals("D")||letter.equals("E")||letter.equals("F")||letter.equals("G")||letter.equals("H")){
				
					Errors = true;
				
				}
				else {
					System.out.println("Error, Letter not in range of A-H, please try again.");	
					Errors = false;
				}
				
				//Checking to ensure number is in bounds of grid
				
				if (number.equals("1")||number.equals("2")||number.equals("3")||number.equals("4")||number.equals("5")||number.equals("6")||number.equals("7")||number.equals("8")){
						
					Errors = true;
					
				}
				else {
					System.out.println("Error, Number not in range of 1-8, please try again.");	
					Errors = false;
				}
				
				//Accounting for if a position has already been hit (all cases: nothing hit, grenade hit, ship hit)
				
				rows = Integer.parseInt(number);
				columns = Character.getNumericValue(letter.charAt(0))-9;
				
				if (grid [rows][columns].getContents().equals("S") || grid [rows][columns].getContents().equals("G") || grid [rows][columns].getContents().equals("*")){
					System.out.println();
					System.out.println("Sorry, that location has already been triggered.");
					skip = true;
				}
				
				//Placing a ship
				
				if (shipsCounter < 6 && skip != true){
					grid [rows][columns].setContents("S");
					grid [rows][columns].setOwner("Human");
					System.out.println(toString());
					shipsCounter++;
				}
				
				//Placing a grenade
				
				else if (grenadesCounter < 4 && skip != true){
					grid [rows][columns].setContents("G");
					grid [rows][columns].setOwner("Human");
					System.out.println(toString());
					grenadesCounter++;
				}
				
				//All places checked, time to break the loop
				
				if (shipsCounter == 6 && grenadesCounter == 4){
					repeat = true;
					Errors = true;
				}
				
			}
			
		}
			
	}
	
	//computer's turn to place battleships and grenades
	
	public void computerPlacements(){
		
		//resetting variables
	
		repeat = false;
		skip = false;
		
		//repeat performs the function until the board is ready
		
		while (repeat == false){
			
			//skip allows the computer to pick again if the location was already occupied by the human
			
			skip = false;
			
			while (skip == false){
			
				rows = rand.nextInt(8)+1;
				columns = rand.nextInt(8)+1;
			
				if (grid [rows][columns].getContents().equals("S") || grid [rows][columns].getContents().equals("G") || grid [rows][columns].getContents().equals("s") || grid [rows][columns].getContents().equals("g") || grid [rows][columns].getContents().equals("*")){
					skip = true;
				}
				
				//Placing ships
				
				if (shipsCounterComp < 6 && skip != true){
					grid [rows][columns].setContents("s");
					grid [rows][columns].setOwner("Computer");
					System.out.println(toString());
					shipsCounterComp++;
				}
				
				//Placing grenades
				
				else if (grenadesCounterComp < 4 && skip != true){
					grid [rows][columns].setContents("g");
					grid [rows][columns].setOwner("Computer");
					System.out.println(toString());
					grenadesCounterComp++;
				}
				
				//All places checked, time to break the loop
				
				if (shipsCounterComp == 6 && grenadesCounterComp == 4){
					
					visibleBoard = toString();
					repeat = true;
					skip = true;
				}
				
			}
		
		}
		
	}
	
	public void playGame(){
		
		//repeat performs the function until the board is ready
		
		repeat = false;
		
		while (repeat == false){
			
			
			//Display the board, all hidden...
			
			System.out.println();
			System.out.println(toStringGame());
			System.out.println();
			
			////Re-does the loop if the human makes a mistake with the location, also skips this step if the human's turn is being skipped
			
			Errors = false;
			
			while (Errors == false && turnHolderHuman != 1){
		
				//Human begins a round
				
				System.out.print("Please select a place on the Grid (*TIP* try to get into the mind of the computer...): ");
		
				input = scan.nextLine();
				System.out.println();
				
				letter = input.substring(0,1).toUpperCase();
				number = input.substring(1,2);
				
				//Checking to ensure letter is in bounds of grid
				
				if (letter.equals("A")|letter.equals("B")||letter.equals("C")||letter.equals("D")||letter.equals("E")||letter.equals("F")||letter.equals("G")||letter.equals("H")){
				
					Errors = true;
				
				}
				
				else {
					System.out.println("Error, Letter not in range of A-H, please try again.");	
					Errors = false;
				}
				
				//Checking to ensure number is in bounds of grid
				
				if (number.equals("1")||number.equals("2")||number.equals("3")||number.equals("4")||number.equals("5")||number.equals("6")||number.equals("7")||number.equals("8")){
						
					Errors = true;
					
				}
				
				else {
					System.out.println("Error, Number not in range of 1-8, please try again.");	
					Errors = false;
				}
				
			}
			
			//Skips a turn when turnHolderHuman = 1
			
			if (turnHolderHuman == 0){
			
				rows = Integer.parseInt(number);
				columns = Character.getNumericValue(letter.charAt(0))-9;
				
				//Human shot at a safe location
				
				if (grid [rows][columns].getContents().equals("*")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					System.out.println("Human took a safe shot!");
					turnHolderHuman++;
						
				}
				
				//Human hit nothing
				
				if (grid [rows][columns].getContents().equals("_")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					System.out.println("Human hit nothing!");
					turnHolderHuman++;
						
				}
				
				//Human hit a computer's ship
				
				if (grid [rows][columns].getContents().equals("s")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					shipsCounterComp--;
					System.out.println("You hit the computer's ship! "+shipsCounterComp+" left.");
					turnHolderHuman++;
						
				}
				
				//human hit own ship, sadness
				
				if (grid [rows][columns].getContents().equals("S")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					shipsCounter--;
					System.out.println("You blew up your own ship, Shucks! "+shipsCounter+" left.");
					turnHolderHuman++;
					
				}
				
				//Human hit a computer's grenade, human loses turn
				
				if (grid [rows][columns].getContents().equals("g")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					grenadesCounterComp--;
					System.out.println("You hit the computer's grenade! "+grenadesCounterComp+" left.");
					System.out.println("Human loses a turn.");
					turnHolderHuman+=2;
					missedTurnsHuman++;
						
				}
				
				//Human hit own grenade, human loses turn
				
				if (grid [rows][columns].getContents().equals("G")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					grenadesCounter--;
					System.out.println("You blew up your own grenade and lose a turn! Shucks! "+grenadesCounter+" left.");
					System.out.println("Human loses a turn.");
					turnHolderHuman+=2;
					missedTurnsHuman++;
					
				}
			
			}
		
			//Computer's turn.
			
			//Skips a turn when turnHolderComp = 1
			
			if(turnHolderComp == 0 && shipsCounterComp != 0){
			
				rows = rand.nextInt(8)+1;
				columns = rand.nextInt(8)+1;
				
				//Computer took a safe shot
				
				if (grid [rows][columns].getContents().equals("*")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					System.out.println("Computer took a safe shot!");
					turnHolderComp++;
						
				}
				
				//Computer hit nothing
				
				if (grid [rows][columns].getContents().equals("_")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					System.out.println("Computer hit nothing!");
					turnHolderComp++;
						
				}
				
				//Computer hit a human's ship
				
				if (grid [rows][columns].getContents().equals("S")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					shipsCounter--;
					System.out.println("Computer hit the human's ship! "+shipsCounter+" left.");
					turnHolderComp++;
						
				}
				
				//Computer hit own ship, sadness
				
				if (grid [rows][columns].getContents().equals("s")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					shipsCounterComp--;
					System.out.println("Computer blew up own ship! Nice! "+shipsCounterComp+" left.");
					turnHolderComp++;
					
				}
				
				//Computer hit a human's grenade
				
				if (grid [rows][columns].getContents().equals("G")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					grenadesCounter--;
					System.out.println("Computer hit the human's grenade! "+grenadesCounter+" left.");
					System.out.println("Computer loses a turn.");
					turnHolderComp+=2;
					missedTurnsComp++;
						
				}
				
				//Computer hit own grenade, computer loses turn
				
				if (grid [rows][columns].getContents().equals("g")){
					
					grid [rows][columns].setCalled(true);
					grid [rows][columns].setContents("*");
					grenadesCounterComp--;
					System.out.println("Computer blew up own grenade and loses a turn! Nice! "+grenadesCounterComp+" left.");
					System.out.println("Computer loses a turn.");
					turnHolderComp+=2;
					missedTurnsComp++;
					
				}
			
			}
			
			//Human loses, Computer wins
			
			if (shipsCounter == 0){
				
				//declare winner
				System.out.println();
				System.out.println("The Computer has sunk all your ships. Better luck next time!");
				//display number of turns missed
				System.out.println("The computer missed "+missedTurnsComp+" turns and you missed "+missedTurnsHuman+" turns.");
				System.out.println();
				//reveal board
				System.out.println("Revealed Board:");
				System.out.println(visibleBoard);
				
				repeat = true;
				
			}
			
			//Human wins, Computer loses
			
			if (shipsCounterComp == 0){
				
				//declare winner
				System.out.println();
				System.out.println("Congraulations, you have defeated the Computer by sinking all its ships!");
				//display number of turns missed
				System.out.println("The computer missed "+missedTurnsComp+" turns and you missed "+missedTurnsHuman+" turns.");
				System.out.println();
				//reveal board
				System.out.println("Revealed Board:");
				System.out.println(visibleBoard);
				
				repeat = true;
				
			}
			
			turnHolderHuman--;
			turnHolderComp--;
			
		}
		
	}
	
	
	
	//toString method for grid display
	
	public String toString(){
		
		//puts all text in a neat 'paragraph'
		
		printer = "";
		
		for (int a = 0; a <= 8; a++){
			
			for (int b = 0; b <= 8; b++){
				
				printer += grid [0][0].getContents();
				printer += grid [a][b].getContents();
				
			}
			
					printer += "\r";
		}
		
		return printer;
		
	}
	
	//toString method for grid display during game (different modifications apply)
	
	public String toStringGame(){
		
		printer = "";
		
		for (int a = 0; a <= 8; a++){
			
			for (int b = 0; b <= 8; b++){
				
				if (grid [a][b].getCalled() == true){
					
					printer += grid [0][0].getContents();
					printer += grid [a][b].getContents();
				
				}
				
				else if (grid [a][b].getCalled() == false){
					
					printer += grid [0][0].getContents();
					printer += "_";
					
				}
				
			}
			
			printer += "\r";
		}
		
		return printer;
		
	}

}
