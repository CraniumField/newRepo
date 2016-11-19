import java.util.Random;
import java.util.Scanner;
public class A3Question1 {

	//random poem generator. Takes in input from the user and makes different combinations of poems with it.
	
	public static void main (String [] args){
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to write a poem? Let's get started!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//initializing variables
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int z = 0;
		int x = 0;
		int y = 0;
		int nounsNumb = 0;
		int adjesNumb = 0;
		
		boolean invalidInputN = false;
		boolean invalidInputA = false;
		boolean mainLoop = false;
		boolean outerLoop = false;
		boolean innerLoopA = false;
		boolean innerLoopN = false;
		
		System.out.println("How many nouns would you like? min 3.");
		
		//Prompting the user for the number of nouns they'd like in their poem
		
		while (invalidInputN == false){
			z = scan.nextInt();
			if (z < 3){System.out.println("Please enter a number greater than 3.");}
			else {
				nounsNumb = z;
				invalidInputN = true;
			}
		}
		
		String [] storageN = new String [nounsNumb]; //is used to keep track of which nouns have already been used (randomly)
		String [] nouns = new String [nounsNumb]; //stores all nouns
		boolean [] wrongN = new boolean [nounsNumb]; //is used for evaluating whether or not all the nouns have been used
		
		int h = 0;
		int i = 0;
		
		
		//Allowing the user to fill their array with their chosen nouns
		
		System.out.println("Please enter "+nounsNumb+" nouns");
		
		for (int a = 0; a<z; a++){
			
			nouns [a] = scan.next();
			
		}
				
		System.out.println("How many adjectives would you like? min 3.");
		
		//Prompting the user for the number of adjectives they'd like in their poem
		
		while (invalidInputA == false){
			x = scan.nextInt();
			if (x < 3){System.out.println("Please enter a number greater than 3.");}
			else {
				adjesNumb = x;
				invalidInputA = true;
			}
		}
		
		String [] storageA = new String [adjesNumb]; //is used to keep track of which adjectives have already been used (randomly)
		String [] adjectives = new String [adjesNumb]; //stores all adjectives
		boolean [] wrongA = new boolean [adjesNumb]; //is used for evaluating whether or not all the adjectives have been used
		
		//Allowing the user to fill their array with their chosen adjectives
		
		System.out.println("Please enter "+adjesNumb+" adjectives");
				
		for (int a = 0; a<x; a++){
					
			adjectives [a] = scan.next();
					
		}
		
		
		//Choosing adjective & noun in pairs, no repeats until all chosen.
		
		while (mainLoop == false){
			System.out.println();
			System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t    Here is my Java POEM!!!    ");
			System.out.println("\t    ******LOOK AROUND******    ");
			System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			y++;
		
			for (int a = 0; a < 3; a++){ // Prints a poem, consisting of a pair of 1 adjective and 1 noun, per 3 lines
			
				if (a == 0){System.out.print("\t");}
				if (a == 1){System.out.print("\t\t");}
				if (a == 2){System.out.print("\t\t\t");}
				
					outerLoop = false;
					while (outerLoop == false){
						h = rand.nextInt(adjesNumb); //generates number for adjectives
						
						if (storageA [h] == adjectives [h]){
								
								//checks if the adjective has been used before. If all other adjectives have also been used, then it is used. Otherwise, loops again.
							
								for (int m = 0; m < adjesNumb; m++){
									
									if (storageA [m] == adjectives [m]){wrongA [m] = true;}
									else {wrongA [m] = false;}
									
								}
								
								innerLoopA = true;
								for (int l = 0; l <adjesNumb; l++){
									
									if (wrongA [ l ] == false){innerLoopA = false;}
										
								}
								
								//innerLoopA will only be true here if every adjective has been used already, if so it is printed and program moves on from loop.
								
								if (innerLoopA == true && wrongA [h] == true){
									System.out.print(adjectives [h]+" "); //prints adjective
									outerLoop = true;
								}
						
						
						}
					
						//adjective hasn't been used before, prints it
						
						else if (storageA [h] != adjectives [h]){
						
							storageA [h] = adjectives [h];
							System.out.print(adjectives [h]+" "); //prints adjective
							outerLoop = true;
						
						}
					
					}
					
				
				
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			
					outerLoop = false;
					while (outerLoop == false){
						i = rand.nextInt(nounsNumb); //generates number for nouns
						if (storageN [i] == nouns [i]){
							
							//checks if the noun has been used before. If all other nouns have also been used, then it is used. Otherwise, loops again.
							
							for (int n = 0; n < nounsNumb; n++){
								
								if (storageN [n] == nouns [n]){wrongN [n] = true;}
								else {wrongN [n] = false;}
								
							}
							
							innerLoopN = true;
							for (int o = 0; o <nounsNumb; o++){
								
								if (wrongN [ o ] == false){innerLoopN = false;}
									
							}
							
							//innerLoopN will only be true here if every nouns has been used already, if so it is printed and program moves on from loop.
							
							if (innerLoopN == true && wrongN [i] == true){
								System.out.println(nouns [i]+" "); //prints adjective}
								outerLoop = true;
							}
							
							
						}
						
						//noun hasn't been used before, prints it
						
						else if (storageN [i] != nouns [i]){
							
							storageN [i] = nouns [i];
							System.out.println(nouns [i]+" "); //prints noun
							outerLoop = true;
							
						}
						
					}
				
			}
			
			if (y == 1) {scan.nextLine();} //catches loose data in the System.in
			
			//prompts user whether they'd like another poem
			
			System.out.println();
			System.out.println();
			System.out.print("Another poem (y/n)? ");
				if (scan.nextLine().equals("n")==true){
					mainLoop = true;
					}
		
		}
		
		//thanks the user
		
		System.out.println("");
		System.out.println("Thank you for using the java poem generator!");
		scan.close();
		
	}
	
}
