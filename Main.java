//Author: Jay Olson
//Section: CIS 2212-801
//Assignment: Assignment 6, Passphrase Generator
//Due Date: April 26, 2026
//Submitted: 

/*

Purpose: To create a solution that reads data from a file with proper exception handling and considers code reuse in the project design.
Goal: To Design, write, and test an object-oriented solution that produces random passphrases made from words loaded from a text file.
 */

//https://github.com/jayosinclair/CIS2212_A6_PassphraseGenerator.git


//The word list for this program was found with a quick google search, which returned this github link:
//https://github.com/dwyl/english-words/blob/master/words.txt

//**********************************************************************************************************************

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int numPassphrases = 0;
		int numWords = 0;

		System.out.println("I will generate random passphrases made up of random words of a specified size.\n");
		
		//Put all this into a while loop.
		
		System.out.print("How many random passphrases do you want to generate? ");
		
		numPassphrases = scnr.nextInt(); //TODO: Catch input errors.
		//System.out.println("Make sure you enter an integer. Try again.");

		System.out.print("How many words should be in each passphrase? ");
		numWords = scnr.nextInt(); //TODO: Catch input errors.
		//System.out.println("Make sure you enter an integer. Try again.");

		System.out.print("Enter the size of each of the words used to make the random passphrases. "); //TODO: Catch input errors.
		//System.out.println("Make sure you enter an integer. Try again.");

		System.out.println("Sorry, but no words of that size are in that list.");

		System.out.println("Here are your random passphrases:");
		//Print each of the passphrases

		System.out.print("Do you want to create more passphrases? (Y or N): ");
		//TODO: Keep validating inputs throughout...
		
		//Loop End


		System.out.println("Bye!");
		
		






    }
}
