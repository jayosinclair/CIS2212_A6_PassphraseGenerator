import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PassphraseGenerator {

    WordBank list;

        /*
        will provide the user interface layer for our application. Here are the specifications for the passphrase generator class:
    •We will construct the PassphraseGenerator object in the main method and call the method we write 
    that drives the user interface. You can name that method in the PassphraseGenerator class whatever you wish.

    */


    public void go(String filePath){

        //Method that starts the generator... TODO Need to make conditional depending on route taken (specific size or not).

        try{

            list = new WordBank(filePath);

        }

        catch(FileNotFoundException e){
            
            //TODO add a while loop to keep prompting for a file.
            System.out.println("File not found. Please try again or type Q to quit: ");
            
        }



        try{

            list = new WordBank(filePath, size); //TODO need to handle size

        }

        catch(FileNotFoundException e){
            
            //TODO add a while loop to keep prompting for a file.
            System.out.println("File not found. Please try again or type Q to quit: ");
            
        }


    }

    public void buildPhrase(){

        //Prompt the user for the number of passphrases to be created, the number of words to be included 
        //in each passphrase, and how many letters should be in each random word that is used to create the passphrases.

        //Verify that the requested word size will work. If no word exists of that size, display an error message.

        //Build and display the passphrases with the requested number of random words of the specified size from the word bank.
        
        //Ask the user if they wish to build more passphrases. If the answer is yes, do not reload the words from the file! That is inefficient.   


    }




    /**
	 * Method getIntResponse is a helper method that seeks integer input > 0 and validates it is, in fact, an integer > 0. Input is
	 * sought until an integer > 0 is successfully retrieved.
	 * @param input is a Scanner object that can be used to get input from the keyboard, a file, etc. 
	 * It is only used as keyboard input in this program, but reuse is simple.
	 * @return response value is validated, integer > 0 output
	 */
	private static int getIntResponse(Scanner input){

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
	 * Method getYNCharacterResponse is a helper method that seeks a Character object and validates it is, in fact, a character that is either Y or N. Input is
	 * sought until a Character object is entered and it is a Y or N (or lowercase counterparts y or n, which are converted to uppercase).
	 * @param input is a Scanner object that can be used to get input from the keyboard, a file, etc. 
	 * It is only used as keyboard input in this program, but reuse is simple.
	 * @return response value is validated, Character that is y/Y/n/N
	 */
	private static Character getYNCharacterResponse(Scanner input){

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
