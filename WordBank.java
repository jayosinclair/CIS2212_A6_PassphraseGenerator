public class WordBank {

    /*
    
    The WordBank will be built by reading words from a text file. 
    Since no word list is provided, you’ll need to download one from 
    the internet that includes many words to produce good passphrases.

We do not want WordBank objects to perform input or output because their responsibility should be limited to processing words, not how information is read or displayed. If the class itself handles Input/Output (like printing error messages to the console or asking the user for values), it becomes tightly coupled to a specific way of interacting with the program, which makes it harder to reuse in
Catch input errors. Make sure a word of that size is in the word bank.
Notice that we used a different word size. We do not want to reload the word bank! Load it once and include all the words.
different contexts (such as a graphical interface, a web app, or automated testing). 
By keeping I/O separate, the WordBank class remains focused on processing words while 
other parts of the program decide how to present that information or gather input. This separation 
makes the code cleaner, easier to test, and more flexible for future changes. With that layered architecture 
design philosophy in mind, the WordBank class should not perform input or output.

•The word bank needs to read words from a text file. The pathname of the file should be provided when the word 
bank is constructed. The word bank class does not know how to deal with a file-not-found error. 
Therefore, the word bank class should NOT catch a file-not-found exception. If an error occurs, 
the exception should be thrown from the word bank class and caught at the user interface level, where an 
appropriate error message can be displayed, and the program can crash gracefully. Make sure you test this 
error by running the program with a file name that does not exist. AI Tip: If the examples in the 
textbook are not sufficient, research how to catch and throw exceptions.

•We need the flexibility to construct a word bank in two different ways.
    oWe want to be able to create a word bank that contains all words that are in a text file.
    
    oWe also want the option to create a word bank that contains only words of specific size, 
    like only 5-letter words for a game of Wordle.
•We don’t know how many words we need to store in the word bank, so the collection 
object we use must be dynamic. Name the collection wordBankWords.

•We want to avoid duplicating code, so we want the logic that reads the words from a file to be in one method.
    oEach of the constructors will call this method to do the work of reading words from the file and adding them to the list.
    
    oThis method will be called only from within the class.
    
    oThe method needs to know the size of the words we want to keep or if we want 
    to keep all the words. (This is a bit tricky. Maybe pass a -1 for the word size when we want to load all the words.)
    
    oThe method that loads the words should open the text file, which means it must 
    throw the file-not-found exception. Again, do not catch this error in the WordBank class.

•Our WordBank class needs the following behaviors:
    oGet a random word from the list.
    
    oGet a random word from the list of a specific size, in the case that the list contains all 
    the words of various sizes. If no words exist of that size, return an empty String.
    
    oTrue or false, is a specified word in the list? (While this method will not be 
    useful when creating random passphrases, it will be very useful in other applications 
    that need to verify if a string of characters represents a word. So, we will add this 
    method to our design and write temporary code to test it.)
    
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
    
    */
    
}
