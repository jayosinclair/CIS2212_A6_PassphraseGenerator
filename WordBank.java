
import java.io.FileInputStream;
import java.io.FileNotFoundException; //Use hashset instead of an ArrayList
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class WordBank {

    public static final int NO_SPECIFIED_WORD_SIZE = -1;
    public String word;
    public Random rand;
    public ArrayList <String> wordBankWords;
    public Set <Integer> wordBankWordSizes;
    public FileInputStream inputFileStrm; //Set to null here, but can instantiate in readWordsFromFile method.
    public Scanner inputFScnr;


    /**
     * Constructor WordBank with a single parameter builds a word bank irrespective of word size.
     * @param filePath provides the input file's file path.
     * @throws FileNotFoundException
     */
    public WordBank(String filePath) throws FileNotFoundException{ //This constructor only takes in one parameter

        rand = new Random();
        wordBankWords = new ArrayList <> ();
        wordBankWordSizes = new HashSet<>();
        inputFileStrm = null;
        inputFScnr = null;
        rand = new Random();

        readWordsFromFile(filePath, NO_SPECIFIED_WORD_SIZE);

    }

    /**
     * Constructor WordBank with two parameters builds a word bank ONLY consisting of words of a specified size.
     * @param filePath provides the input file's file path.
     * @param specificSize provides a user-defined word size that limits the results of what gets read into the container object from the file.
     * @throws FileNotFoundException
     */
    public WordBank(String filePath, int specificSize) throws FileNotFoundException{ //This overloaded constructor takes in two parameters

        rand = new Random();
        wordBankWords = new ArrayList <> ();
        wordBankWordSizes = new HashSet<>();
        inputFileStrm = null;
        inputFScnr = null;
        rand = new Random();

        readWordsFromFile(filePath, specificSize);

    }

    /**
     * Method readWordsFromFile cycles through an input file and creates a word bank
     * @param filePath
     * @throws FileNotFoundException
     */
    private void readWordsFromFile(String filePath, int specificWordSize) throws FileNotFoundException{

        inputFileStrm = new FileInputStream(filePath);
        inputFScnr = new Scanner(inputFileStrm);

        if (specificWordSize == NO_SPECIFIED_WORD_SIZE){
        
            while (inputFScnr.hasNextLine()){

                    word = inputFScnr.nextLine();

                    wordBankWords.add(word);

                    wordBankWordSizes.add(word.length()); //Each entry is different (kind of...), so have the hashset add each time (the hashset won't record duplicates as a built-in feature).

            }

        }


        else {

            wordBankWordSizes.add(specificWordSize); //Add the specific word size just once... will be the same for all entries

            while (inputFScnr.hasNextLine()){

                word = inputFScnr.nextLine();

                if (word.length() == specificWordSize){

                    wordBankWords.add(word); //Only add the word to the bank if the specific word size passed in matches the word's length.

                }
                
            }

        }
      
    }
    
    public String getRandomWordAnySize(){
        
        int rValue = rand.nextInt(wordBankWords.size()); //Get a random integer value that does not exceed the size of the wordBankWords ArrayList.

        return wordBankWords.get(rValue);

    }


    public String getRandomWordSpecificSize(int size){

        if (isWordInListGivenSize(size) == false){

            return ""; //If no words exist of passed in size, return an empty String.
        
        }

    
        //Get a random word from the list of a specific size, in the case that the list contains all 
        //the words of various sizes. 

        do { 
            
            word = getRandomWordAnySize(); //Execute at least once.

        } while (word.length() != size);


        return word;

    }

    public boolean isWordInList(String value){

        boolean result = false;

        /*
        
         oTrue or false, is a specified word in the list? (While this method will not be 
    useful when creating random passphrases, it will be very useful in other applications 
    that need to verify if a string of characters represents a word. So, we will add this 
    method to our design and write temporary code to test it.)... Use wordBankWords.contains()
        
        */

        if (wordBankWords.contains(value)){
            result = true;
        }

        return result;

    }

    public boolean isWordInListGivenSize(int size){

        boolean result = false;

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

    Use wordBankWords.contains()
    
        */

        if (wordBankWordSizes.contains(size)){

            result = true;

        }

        return result;

    }

    
}
