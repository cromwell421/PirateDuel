/*
* NameOfYourProgram PirateDuel.java
* Author:  Jay Cromwell
* Submission Date:  2/17/2012
*
* Purpose: Ive created a role playing game where the user guesses the correct comeback. Ive repeated my coder
* 3 times for the user has 3 chances to play.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course.
*/



import java.util.Scanner;
 
public class PirateDuel {
 
	// calling from pirateDuelInsults
public static void printComebacks(PirateDuelInsults pdi){
 
 
 
}
 
 
 
	public static void main(String[] args) {
// declaring variables
		int userChoice = 0;
		int wrongUserChoice = 0;
		int gamecounter = 0;
		int gameScore = 0;
		int round1 = 0;
		int round2 = 0;
		int round3 = 0;
		String correctString = "";
		String theInsult = "";
		String chosenString = "";
		
 
			PirateDuelInsults pdi = new PirateDuelInsults();
			// calling the insult
			theInsult = pdi.getInsult();
 
 
			System.out.println("A software pirate challenges you to a sword duel.\nOnly wits as sharp as Occam's razor will prevail.\nEn Garde!");
			
		
 
				
 
				System.out.println("\nThe software pirate yells, " + theInsult);
 
 
					System.out.println("\nYou ponder some clever comebacks...");
			// print 4 random comebacks
					System.out.println("1) " + pdi.getFirstComeback());
					System.out.println("2) " + pdi.getSecondComeback());
					System.out.println("3) " + pdi.getThirdComeback());
					System.out.println("4) " + pdi.getFourthComeback());
					 
					System.out.println("Enter your clever comeback:\t");
					Scanner keyboard = new Scanner (System.in);
					userChoice = keyboard.nextInt();
 					
				// seeing if the input is valid	
			if(userChoice < 1 || userChoice > 4 );
				{
				System.out.println("Enter a valid comeback of 1, 2, 3, or 4:\t");
				Scanner keyboard2 = new Scanner (System.in);
				wrongUserChoice = keyboard2.nextInt();
				 
				
			if (wrongUserChoice < 1 || wrongUserChoice > 4)
				{
				System.out.println("Arg! You must follow directions to play the game.\nGame Over!");
				System.exit(1);
				}
				}
 
				
				// assigning string to number
correctString = pdi.getCorrectComeback(theInsult);
System.out.print(correctString);
 
 if(userChoice == 1 || wrongUserChoice == 1){
				chosenString = pdi.getFirstComeback();
				}
				else if(userChoice == 2 || wrongUserChoice == 2){
				chosenString = pdi.getSecondComeback();
				}
				else if(userChoice == 3 || wrongUserChoice == 3){
				chosenString = pdi.getThirdComeback();
				}
				else if(userChoice == 4 || wrongUserChoice == 4){
				chosenString = pdi.getFourthComeback();
				}	
 
				
			
			System.out.print("\n" + chosenString + "\n");
			if (correctString.equals(chosenString))
			{gameScore = gameScore + 1;
			System.out.println("The software pirate looks stunned.\nYour sword strikes the software pirate.");
			
			}
			else {
				System.out.println("You got served, laughs the software pirate.\nThe software pirate's sword strikes you.");
						
			}
			
			 
			
			
	// Repeat game for round 2
			int userChoice2 = 0;
			int wrongUserChoice2 = 0;
			String chosenString2 = "";
			String correctString2 = "";
			String theInsult2 = "";			
			theInsult2 = pdi.getInsult();
			System.out.println("\nThe software pirate yells, " + theInsult2);
			 
			 
			System.out.println("\nYou ponder some clever comebacks...");
			 
			System.out.println("1) " + pdi.getFirstComeback());
			System.out.println("2) " + pdi.getSecondComeback());
			System.out.println("3) " + pdi.getThirdComeback());
			System.out.println("4) " + pdi.getFourthComeback());
			 
			System.out.println("Enter your clever comeback:\t");
			Scanner keyboard2 = new Scanner (System.in);
			userChoice2 = keyboard2.nextInt();
				
			
	if(userChoice2 <1 || userChoice2 > 4 );
		{
		System.out.println("Enter a valid comeback of 1, 2, 3, or 4:\t");
		Scanner keyboard3 = new Scanner (System.in);
		wrongUserChoice2 = keyboard3.nextInt();
		 
		
	if (wrongUserChoice2 < 1 || wrongUserChoice2 > 4)
		{
		System.out.println("Arg! You must follow directions to play the game.\nGame Over!");
		System.exit(1);
		}
		}



correctString2 = pdi.getCorrectComeback(theInsult2);
System.out.print(correctString2);

		if(userChoice2 == 1 || wrongUserChoice2 == 1){
		chosenString2 = pdi.getFirstComeback();
		}
		else if(userChoice2 == 2 || wrongUserChoice2 == 2){
		chosenString2 = pdi.getSecondComeback();
		}
		else if(userChoice2 == 3 || wrongUserChoice2 == 3){
		chosenString2 = pdi.getThirdComeback();
		}
		else if(userChoice2 == 4 || wrongUserChoice2 == 4){
		chosenString2 = pdi.getFourthComeback();
		}	

		
		
	System.out.print("\n" + chosenString + "\n");
	if (correctString2.equals(chosenString2))
	{gameScore = gameScore + 1;
	System.out.println("The software pirate looks stunned.\nYour sword strikes the software pirate.");
	
	}
	else {
		
	System.out.println("You got served, laughs the software pirate.\nThe software pirate's sword strikes you.");
				
	}
	
	 
	
	

// Repeats game for third time
	int userChoice3 = 0;
	int wrongUserChoice3 = 0;
	String chosenString3 = "";
	String correctString3 = "";		
	String theInsult3 = "";
	theInsult3 = pdi.getInsult();
	
	
	System.out.println("\nThe software pirate yells, " + theInsult3);
	 
	 
	System.out.println("\nYou ponder some clever comebacks...");
	 
	System.out.println("1) " + pdi.getFirstComeback());
	System.out.println("2) " + pdi.getSecondComeback());
	System.out.println("3) " + pdi.getThirdComeback());
	System.out.println("4) " + pdi.getFourthComeback());
	 
	System.out.println("Enter your clever comeback:\t");
	Scanner keyboard4 = new Scanner (System.in);
	userChoice3 = keyboard4.nextInt();
		
	
if(userChoice3 <1 || userChoice3 > 4 );
{
System.out.println("Enter a valid comeback of 1, 2, 3, or 4:\t");
Scanner keyboard5 = new Scanner (System.in);
wrongUserChoice3 = keyboard5.nextInt();
 

if (wrongUserChoice3 < 1 || wrongUserChoice3 > 4)
{
System.out.println("Arg! You must follow directions to play the game.\nGame Over!");
System.exit(1);
}
}



		correctString3 = pdi.getCorrectComeback(theInsult3);
		System.out.print(correctString3);
		
		if(userChoice3 == 1 || wrongUserChoice3 == 1){
		chosenString3 = pdi.getFirstComeback();
		}
		else if(userChoice3 == 2 || wrongUserChoice3 == 2){
		chosenString3 = pdi.getSecondComeback();
		}
		else if(userChoice3 == 3 || wrongUserChoice3 == 3){
		chosenString3 = pdi.getThirdComeback();
		}
		else if(userChoice3 == 4 || wrongUserChoice3 == 4){
		chosenString3 = pdi.getFourthComeback();
		}	
		
		
		
		System.out.print("\n" + chosenString3 + "\n");
		if (correctString3.equals(chosenString3))
		{gameScore = gameScore + 1;
		System.out.println("The software pirate looks stunned.\nYour sword strikes the software pirate.");
		
		}
		else {
		
		System.out.println("You got served, laughs the software pirate.\nThe software pirate's sword strikes you.");
				
		}
		
		
			
			
			
		
			System.out.println("The Duel ends.");
			System.out.println("\nYou struck the the software pirate " + gameScore + " out of 3 times");
		// deciding if user won or lost duel by how many times they guessed correctly
			if (gameScore >= 2)
			{System.out.println("You won the duel.");
			}
			else 
			{System.out.println("You lost the duel.");
			}
		// ranking the user	
			if(gameScore == 0)
			{System.out.println("Your pirate rank is NOOB!");
			}
			else if(gameScore == 1)
			{System.out.println("Your pirate rank is MEDIOCRE MARAUDER!");				
			}
			else if(gameScore == 2)
			{System.out.println("Your pirate rank is CUNNING COURAGEOUS CORSAIR!");
			}
			else if(gameScore == 3)
			{System.out.println("Your pirate rank is BOLD BELLIGERENT BARNACLED BUCCANEER!");
			}
	
	
	
	
	
	
	
	
	
	
	}
			 
			 
	}
					
					