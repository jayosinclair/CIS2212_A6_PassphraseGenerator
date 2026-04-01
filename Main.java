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

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

		Scanner scnr = new Scanner(System.in);
		int numPassphrases = 0;
		int numWords = 0;
		int wordSize = 0;
		boolean keepGoing = true;

		System.out.println("I will generate random passphrases made up of random words of a specified size.\n");
		
		while (keepGoing){
		
			System.out.print("How many random passphrases do you want to generate? ");
			
			numPassphrases = getIntResponse(scnr);
			System.out.println(numPassphrases);
			
			System.out.print("How many words should be in each passphrase? ");
			numWords = getIntResponse(scnr);
			System.out.println(numWords);

			System.out.print("Enter the size of each of the words used to make the random passphrases. ");
			wordSize = getIntResponse(scnr);
			System.out.println(numWords);

			//TODO: Handle this with a loop through an ArrayList...
			System.out.println("Sorry, but no words of that size are in that list.");

			System.out.println("Here are your random passphrases:");
			//Print each of the passphrases

			System.out.print("Do you want to create more passphrases? (Y or N): ");
			if (getYNCharacterResponse(scnr) == 'N' || getYNCharacterResponse(scnr) == 'n'){
				keepGoing = false;
			}


		}

		System.out.println("Bye!");

    }


	/**
	 * Method getIntResponse seeks integer input > 0 and validates it is, in fact, an integer > 0. Input is
	 * sought until an integer > 0 is successfully retrieved.
	 * @param input is a Scanner object that can be used to get input from the keyboard, a file, etc. 
	 * It is only used as keyboard input in this program, but reuse is simple.
	 * @return response value is validated, integer > 0 output
	 */
	public static int getIntResponse(Scanner input){

		int response = -1; //Cannot have a negative number of passphrases, word size, etc., so using this as sentinel

		while (response < 0){

			try{
				response = input.nextInt();

				if (response < 0){
					System.out.print("Make sure you enter a integer greater than 0. Try again. ");
				}

			}

			catch(InputMismatchException e){
				System.out.print("Make sure you enter a integer greater than 0. Try again. ");
				input.next(); //Clear the buffer
			}

		}

		return response;

	}

	/**
	 * Method getYNCharacterResponse seeks a Character object and validates it is, in fact, a character that is either Y or N. Input is
	 * sought until a Character object is entered and it is a Y or N (or lowercase counterparts y or n, which are converted to uppercase).
	 * @param input is a Scanner object that can be used to get input from the keyboard, a file, etc. 
	 * It is only used as keyboard input in this program, but reuse is simple.
	 * @return response value is validated, Character that is y/Y/n/N
	 */
	public static Character getYNCharacterResponse(Scanner input){

		Character response = 'Q';

		while (Character.toUpperCase(response) != 'Y' && Character.toUpperCase(response) != 'N'){

			try{
				
				response = input.next().charAt(0);
				response = Character.toUpperCase(response);

			}

			catch(InputMismatchException e){
				System.out.print("Make sure you enter Y or N. Try again. ");
				input.next(); //Clear the buffer
			}

			if (Character.toUpperCase(response) != 'Y' && Character.toUpperCase(response) != 'N'){
				System.out.print("Make sure you enter Y or N. Try again. ");
			}

		}

		return response;

	}

}
