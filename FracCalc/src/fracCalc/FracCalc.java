// In the end, it will all be in a while loop
// Takes the input of one string
// Checks if a string == quit
// Calls produceAnswer and inputs the string
// Separates the fractions at the operator
// Finds the whole number in first fraction (if there is one) using a while loop
// Determined if it is the whole number by the next char(continues if it is a number)
// Puts whole number into it's own string called whole number(if none, whole number = 0)
// Finds numerator of fraction by looking for the slash
// Sets numerator to its own string
// Skips the slash and puts until the next space
// Checks for the operator
// Repeats previous process for second fraction except for operation

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    		Scanner userInput = new Scanner(System.in);
    		String s = "";
    		String quit = "quit";
    		while (s != quit) {
    			System.out.print("What is your equation? ");
    			s = userInput.next();
    			if (s.equals("quit")) {
    			
    			}
    			else {
    				produceAnswer(s);
    			}
    			}
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
    	    int a = input.indexOf(" * ");
    		int b = input.indexOf(" / ");
    		int c = input.indexOf(" + ");
    		int d = input.indexOf(" - ");

    		if (a != -1) {
    			System.out.println("This has run");
    			String fOne = input.substring(0, a);
    			String fTwo = input.substring(a + 2, input.length());
    			System.out.print(fOne);
    			System.out.print(fTwo);
    			System.out.println("This has completed");
    		}
    		
    		else if (b != -1) {
    			System.out.println("This has run");
    			String fOne = input.substring(0, b);
    			String fTwo = input.substring(b + 2, input.length());
    			System.out.print(fOne);
    			System.out.print(fTwo);
    			System.out.println("This has completed");
    		}
    		
    		else if (c != -1) {
    			System.out.println("This has run");
    			String fOne = input.substring(0, c);
    			String fTwo = input.substring(c + 2, input.length());
    			System.out.print(fOne);
    			System.out.print(fTwo);
    			System.out.println("This has completed");
    		}
    		
    		else if (d != -1) {
    			System.out.println("This has run");
    			String fOne = input.substring(0, d);
    			String fTwo = input.substring(d + 2, input.length());
    			System.out.print(fOne);
    			System.out.print(fTwo);
    			System.out.println("This has completed");
    		}
    		
    		else {
    			System.out.println("None ran");
    		}
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
