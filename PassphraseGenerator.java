import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PassphraseGenerator {

    public WordBank list;
    public Scanner scnr;

    public PassphraseGenerator() {

        list = null;
        scnr = null;

    }

    public void go(String filePath){

        int numPassphrases = -1;
	    int numWords = -1;
	    int wordSize = -1;
        scnr = new Scanner(System.in);
        boolean keepGoing = true;
        String passPhrase = "";

        System.out.println("I will generate random passphrases made up of random words of a specified size.\n");
        

        while (keepGoing){
                
            System.out.print("\nHow many random passphrases do you want to generate? ");
                    
            numPassphrases = getIntResponse(scnr);
                    
            System.out.print("How many words should be in each passphrase? ");
            numWords = getIntResponse(scnr);

            System.out.print("Enter the size of each of the words used to make the random passphrases. ");
            wordSize = getIntResponse(scnr);



            try{

                list = new WordBank(filePath);

            }

            catch(FileNotFoundException e){
            
                //TODO add a while loop to keep prompting for a file.
                System.out.println("File not found. Do you wish to try again? ");
            
            }




            if (!list.isWordInListGivenSize(wordSize)){
                
                System.out.println("Sorry, but no words of that size are in that list.");

            }



            System.out.println("Here are your random passphrases:");
            
            //Need to actually build passphrase based on number of words. Use nested loop.


            for (int i = 0; i < numPassphrases; i++){

                for (int j = 0; j < numWords; j++){

                    passPhrase += list.getRandomWordAnySize();

                }

                System.out.println(passPhrase);

                passPhrase = ""; //Reset for next passphrase

            }

            System.out.print("Do you want to create more passphrases? (Y or N): ");
            
            if (!isYesResponse(scnr)){
                keepGoing = false; //Kill the loop if something other than Y or y is entered.
            }

        }

        System.out.println("\n\nBye!");

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
	 * Method isYesResponse is a helper method that seeks a Character object and validates it is, in fact, a character that is either Y or N. Input is
	 * sought until a Character object is entered and it is a Y or N (or lowercase counterparts y or n, which are converted to uppercase).
	 * @param input is a Scanner object that can be used to get input from the keyboard, a file, etc. 
	 * It is only used as keyboard input in this program, but reuse is simple.
	 * @return response value is validated and true is returned if Yes and false if No.
	 */
	private static boolean isYesResponse(Scanner input){

		Character response = 'Q';
        boolean result = false;

		while (Character.toUpperCase(response) != 'Y' && Character.toUpperCase(response) != 'N'){

			try{
				
				response = input.next().charAt(0);
				response = Character.toUpperCase(response);
                System.out.println("Response: " + response);

			}

			catch(InputMismatchException e){
				System.out.print("Make sure you enter Y or N. Try again. ");
				input.next(); //Clear the buffer
			}

			if (Character.toUpperCase(response) != 'Y' && Character.toUpperCase(response) != 'N'){
				System.out.print("Make sure you enter Y or N. Try again. ");
			}

		}

        if (response == 'Y'){
            result = true;
        }

		return result;

	}
    
}
