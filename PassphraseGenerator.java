import java.io.FileNotFoundException;

public class PassphraseGenerator {

WordBank list;

    /*
    will provide the user interface layer for our application. Here are the specifications for the passphrase generator class:
•We will construct the PassphraseGenerator object in the main method and call the method we write 
that drives the user interface. You can name that method in the PassphraseGenerator class whatever you wish.

*/

public PassphraseGenerator(String filePath){


}

list = new WordBank(fileName);






/* 


•The class should have a WordBank object. The name of the word list file, which was received in the 
constructor for this class, should be passed to the WordBank constructor.

•If the file is not found, the WordBank object will throw an exception. The exception should be 
caught and handled in the PassphraseGenerator class since it is the user interface layer of our 
project. (You need to test this logic by passing a bad file name.)
•The PassphraseGenerator class needs one behavior that builds the passphrases based on user input. 
We will call this method from the main method.
    
    oPrompt the user for the number of passphrases to be created, the number of words to be included 
    in each passphrase, and how many letters should be in each random word that is used to create the passphrases.
    
    oThe code that gets the numbers from the user should be in a private helper method that is 
    resistant to the normal user data entry errors. If the user enters text instead of a number, 
    catch the error, display an error message, and then loop back and give the user another chance.
    
    oVerify that the requested word size will work. If no word exists of that size, display an error message.
    
    oBuild and display the passphrases with the requested number of random words of the specified size from the word bank.
    
    oAsk the user if they wish to build more passphrases. If the answer is yes, do not reload the words from the file! That is inefficient.   
    
    */
    
}
