// Asks for 2 inputs in form of strings
// Then asks for the type of operation in form of x, /, -, +
// Calls produceAnswer and inputs those strings and the operation
// Interprets the operation in the string using if statements
// Finds the whole number in first fraction (if there is one) using a while loop
// Determined if it is the whole number by the next char(continues if it is a number)
// Puts whole number into it's own string called whole number(if none, whole number = 0)
// Finds numerator of fraction
package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    		Scanner userInput = new Scanner(System.in);
    		System.out.print("Give me a number: ");
    		String s = userInput.next();
    		int i = s;
    		
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
