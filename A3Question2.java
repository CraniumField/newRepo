import java.util.Scanner;

//Offers booking for a 42 seat concert. Seats are chosen until none are left!

public class A3Question2 {

	public static void main (String [] args){
		
		System.out.println("-------------------------------------------------");
		System.out.println("--------COMP248 Concert IS BACK IN TOWN----------");
		System.out.println("	  Hurry book your ticket Now!!           ");
		System.out.println("-------------------------------------------------");

		//Declaring variables
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		//initializing tickets at 42, and other numerical values
		
		int tickets = 42;
		int request = 0;
		int column = 0;
		double balance = 0;
		
		//booleans
		
		boolean mainLoop = false;
		boolean outerLoop = false;
		boolean innerLoop = false;
		
		//array
		
		String [][] seats = new String [6][8];
		
		//filling array with numbers and characters
		
		for (int a = 0; a < seats.length; a++){//filling column 1 with values 1-6.
			
			seats[a][0] = (""+(a+1)+"");
			
		}
		for (int a = 0; a < seats.length; a++){//filling column 2 with value A
			
			seats[a][1] = ("A");
			
		}
		for (int a = 0; a < seats.length; a++){//filling column 3 with value ...
	
			seats[a][2] = ("B");
	
		}
		for (int a = 0; a < seats.length; a++){
	
			seats[a][3] = ("C");
	
		}
		for (int a = 0; a < seats.length; a++){
	
			seats[a][4] = ("D");
	
		}
		for (int a = 0; a < seats.length; a++){
	
			seats[a][5] = ("E");
	
		}
		for (int a = 0; a < seats.length; a++){
			
			seats[a][6] = ("F");
	
		}
		for (int a = 0; a < seats.length; a++){
			
			seats[a][7] = ("G");
	
		}
		
		System.out.println();
		
		//Prints out entire 2D array with spacing
		
		for (int i = 0; i < seats.length; i++){
			
			for (int j = 0; j <seats[0].length; j++){
				
				System.out.print(seats[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
		
		//prints price information for the user
		
		System.out.println();
		System.out.println("Rows 1 & 2 Gold 100 CAD/ticket");
		System.out.println("Rows 3 & 4 Silver 70 CAD/ticket");
		System.out.println("Rows 5 & 6 Bronze 40 CAD/ticket");
		
		//Sells tickets to costumer until they choose to exit the loop
		
		while (mainLoop == false){
		
			System.out.println("Available seats "+tickets);
			System.out.println("How many tickets do you need?");
			request = scan.nextInt();
		
			//Not enough tickets are available, closes program
		
			if (request > tickets){
				System.out.println("Sorry cannot process your request");
				System.out.println("No more seat are available");
				System.out.println("Thank you for choosing our reservation system!!");
				System.exit(0);
			}
		
			//if enough seats are available, allows user to select them 1 by 1 until complete. All mistakes will cause a prompt. Goes until all requested seats have been chosen.
		
			for (int a = 0; a < request; a++){
			
			
				outerLoop = false;
				while (outerLoop == false){
				
				
					innerLoop = false;
					while (innerLoop == false){
					
						
						//asks for seat selection from user
						System.out.println("Input your seat selection");
						System.out.println("Enter the row number and then the seat letter (example: 3B)");
						input = scan.next();
						
						//when outerloop is true, valid input (successfully leaves behind the loop) and the program continues to next section
						//when outerloop remains false, invalid input (failure) and the user is prompted to try again
						
						//checks if input has an int from 1-6 AND a character from A-G
						
						if ((input.substring(0,1).equals("1") || input.substring(0,1).equals("2") || input.substring(0,1).equals("3") || input.substring(0,1).equals("4") || input.substring(0,1).equals("5") || input.substring(0,1).equals("6")) && (input.substring(1).equals("A") || input.substring(1).equals("B") || input.substring(1).equals("C") || input.substring(1).equals("D") || input.substring(1).equals("E") || input.substring(1).equals("F") || input.substring(1).equals("G"))){
							outerLoop = true;
						}
						else{
							System.out.println("Invalid Seat assignment");
							System.out.println("Input your seat selection");
							System.out.println("Enter the row number and then the seat letter (example: 3B)");
							input = scan.next();
						}
			
						//checks if the first symbol of input is an int from 1-6
						
						if (input.substring(0,1).equals("1") || input.substring(0,1).equals("2") || input.substring(0,1).equals("3") || input.substring(0,1).equals("4") || input.substring(0,1).equals("5") || input.substring(0,1).equals("6")){
							outerLoop = true;
						}
						else{
							System.out.println("Invalid row number - try again");
							System.out.println("Input your seat selection");
							System.out.println("Enter the row number and then the seat letter (example: 3B)");
							input = scan.next();	
						}
			
						//checks if the second symbol of input is a char from A-G
						
						if (input.substring(1).equals("A") || input.substring(1).equals("B") || input.substring(1).equals("C") || input.substring(1).equals("D") || input.substring(1).equals("E") || input.substring(1).equals("F") || input.substring(1).equals("G")){
							outerLoop = true;
						}
						else{
							System.out.println("Invalid Seat letter - try again");
							System.out.println("Input your seat selection");
							System.out.println("Enter the row number and then the seat letter (example: 3B)");
							input = scan.next();
						}
			
						//costs are calculated based on the selection of the user; only works if correct conditions have been met
						
						if ((input.substring(0,1).equals("1") || input.substring(0,1).equals("2")) && (outerLoop == true)){
				
							balance += 100.0;
				
						}
			
						if ((input.substring(0,1).equals("3") || input.substring(0,1).equals("4") )&& (outerLoop == true)){
				
							balance += 70.0;
				
						}
			
						if ((input.substring(0,1).equals("5") || input.substring(0,1).equals("6")) && (outerLoop == true)){
				
							balance += 40.0;
				
						}
			
						//overcomes ambiguity of which column a given char is in, since every column is filled with a unique char
						
						if (input.substring(1).equals("A")){column=1;}
						if (input.substring(1).equals("B")){column=2;}
						if (input.substring(1).equals("C")){column=3;}
						if (input.substring(1).equals("D")){column=4;}
						if (input.substring(1).equals("E")){column=5;}
						if (input.substring(1).equals("F")){column=6;}
						if (input.substring(1).equals("G")){column=7;}
			
						//checks if seat has already been purchased by checking if its value in the array is equal to X
						
						if (seats [(Integer.valueOf(input.substring(0,1))-1)][column] == "X"){
				
							System.out.println("Seat is already reserved -try again");
				
						}
						
						//if seat is free, continues to next section
						
						else {innerLoop = true;}
			
					}//innerloop ends here
				
				}
			
				//Reserves selected seat by replacing its value in the array by X, displays information
				
				seats [(Integer.valueOf(input.substring(0,1))-1)][column] = "X";
				System.out.println("Your seat is reserved. Your balance is "+balance);
			
				//prints updated theater, subtracts an available ticket
				
				for (int i = 0; i < seats.length; i++){
				
					for (int j = 0; j <seats[0].length; j++){
					
						System.out.print(seats[i][j]+" ");
					
					}
				
					System.out.println();
				
				}
			
				tickets--;
			
			}//outerloop ends here. Booking complete. Displays info, prompts user for another session.
		
			System.out.println("Reservation complete! Please proceed to payment");
			balance = 0;
			System.out.println();
			System.out.println("Do you wish to start a new booking? (y/n)?");
			if (scan.next().equals("n")){
				mainLoop = true;
				System.out.println();
				System.out.println("Thank you for booking with us!");
			}
			
			System.out.println();
			
		}//mainloop ends here. No more sessions, Program is complete.
			
	}
	
}
