
import java.io.FileNotFoundException;
import java.util.Set; //Use hashset instead of an ArrayList
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.random.*;
import java.io.FileInputStream;


public class WordBank {

    public static final int NO_SPECIFIED_WORD_SIZE = -1;

    String word;

    public Set <String> wordBankWords = new HashSet<>();

    //Need a random object

    //Need a scanner object

    //Need inputstream/printstream objects

    //FileInputStream inputFile = new FileInputStream(filePath);
    //Scanner fileScnr = new Scanner(filePath);




    /**
     * Constructor WordBank with a single parameter builds a word bank irrespective of word size.
     * @param filePath provides the input file's file path.
     * @throws FileNotFoundException
     */
    public WordBank(String filePath) throws FileNotFoundException{

        readWordsFromFile(filePath, NO_SPECIFIED_WORD_SIZE);

    }

    /**
     * Constructor WordBank with two parameters builds a word bank ONLY consisting of words of a specified size.
     * @param filePath provides the input file's file path.
     * @param specificSize provides a user-defined word size that limits the results of what gets read into the container object from the file.
     * @throws FileNotFoundException
     */
    public WordBank(String filePath, int specificSize) throws FileNotFoundException{

        readWordsFromFile(filePath, specificSize);

    }

    /**
     * Method readWordsFromFile cycles through an input file and retur
     * @param filePath
     * @throws FileNotFoundException
     */
    private void readWordsFromFile(String filePath, int specificWordSize) throws FileNotFoundException{

        if (specificWordSize == NO_SPECIFIED_WORD_SIZE){

            //We want to load all words

        }

        /*
    
            -The method needs to know the size of the words we want to keep or if we want 
            to keep all the words. (This is a bit tricky. Maybe pass a -1 for the word size when we want to load all the words.)
        
        */

        //The method that loads the words should open the 
        //text file, which means it must throw the file-not-found exception. 
        //Again, do not catch this error in the WordBank class.

        //Add each word to a hashset.

        // So, our method that loads the words should add each word size to a HashSet.

    }
    
    public String getRandomWordAnySize(){

        String fixme;

        //Get a random word from the list.

        return fixme;

    }


    public String getRandomWordSpecificSize(int size){

        String fixme;

        //Get a random word from the list of a specific size, in the case that the list contains all 
        //the words of various sizes. If no words exist of that size, return an empty String.

        return fixme;

    }

    public boolean isWordInList(){

        boolean fixme = false;

        /*
        
         oTrue or false, is a specified word in the list? (While this method will not be 
    useful when creating random passphrases, it will be very useful in other applications 
    that need to verify if a string of characters represents a word. So, we will add this 
    method to our design and write temporary code to test it.)... Hashset is perfect for this.
        
        */

        return fixme;

    }

    public boolean isWordInListGivenSize(int size){

        boolean fixme = false;

        /*
        
            oTrue or false, does the list contain words of a certain size?
    There is a challenging problem we must address pertaining to checking if words of a certain size exist 
    in the word bank. What if the method is called to get a random word of a certain size from the 
    list and no such word exists? For example, say we call the method and request a 25-letter word and 
    no word that large exists in the list. Our program could get caught in an infinite loop trying to 
    randomly choose a word with size = 25. To solve this problem, we need to keep track of the word sizes 
    in our list. A HashSet is a class in the Java library that is perfect for this situation. We can add numbers 
    to a HashSet and it will keep only one copy of each unique number. We can then later ask the HashSet if it 
    contains a certain number. So, our method that loads the words should add each word size to a HashSet. Then 
    the getWord(int size) method should make sure that the HashSet contains the number in the size parameter. If no 
    word of that size exists in the list, then the method should return an empty String. AI Tip: Research examples 
    that use Java HashSet or look at the chapter in the online book about Collections.

    an enhanced for loop should help with this...

    for (String value : wordBankWords){

    System.out.println(value); IF the strlen matches size


        */



        return fixme;

    }

    
}
