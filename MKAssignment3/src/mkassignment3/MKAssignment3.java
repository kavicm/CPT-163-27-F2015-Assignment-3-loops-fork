
package mkassignment3;
/**
This program will reverse a 5 letter string entered by the user.
 */
import java.util.Scanner;

public class MKAssignment3 {

    public static void main(String[] args) {
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        int loopVal; 
        int end = 0;
        String word;
        
        //Get user's word
        System.out.print("Please enter a word. ");
        word = keyboard.next();
        
        //Output the reverse of the word
        System.out.print(word + " => ");
         for(loopVal = (word.length()-1); loopVal >= end; loopVal--){
             char letter = word.charAt(loopVal);
             System.out.print(letter);
         }
         
    }
    
    
}
