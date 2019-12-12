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
    		System.out.println("Only type words in lower case.");
    		String s = "";
    		String quit = "quit";
    		while (!(s.equals(quit))) {
    			System.out.print("What is your equation? ");
    			s = userInput.next();
    			if (!(s.toLowerCase().equals(quit))) {
    				tester(s);
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
    	String fOne = "";
        String fTwo = "";
    	int a = input.indexOf(" * ");
    	int b = input.indexOf(" / ");
    	int c = input.indexOf(" + ");
    	int d = input.indexOf(" - ");
    	int e;
    	int f;
    	int g;
    	int h;
    	int i;
    	int j;
    	int k;
    	int l;
    	int m;
    	String wnd = "";
    	String whole = "0";
    	String wholeOne = "0";
    	String numerator = "0";
    	String numeratorOne = "0";
    	String denominator = "1";
    	String denominatorOne = "1";
    	String sum = "";


		if (a != -1) {
			//System.out.println("This has run");
			fOne = input.substring(0, a);
			fTwo = input.substring(a + 3, input.length());
			//System.out.print(fOne);
			//System.out.print(fTwo);
			//System.out.println("This has completed");
			e = fTwo.indexOf("_");
			if (e != -1) {
				whole = fTwo.substring(0, e);
			}
			g = fTwo.length();
			f = fTwo.indexOf("/");
			if (f != -1) {
				numerator = fTwo.substring(e + 1, f);
				denominator = fTwo.substring(f + 1, g);
			}
			if (f == -1) {
				whole = fTwo;
			}
			h = fOne.indexOf("_");
			if (h != -1) {
				wholeOne = fOne.substring(0, e);
			}
			i = fOne.length();
			j = fOne.indexOf("/");
			if (j != -1) {
				numeratorOne = fOne.substring(h + 1, j);
				denominatorOne = fOne.substring(j + 1, i);
			}
			if (j == -1) {
				wholeOne = fOne;
			}
			wnd += "whole:";
			wnd += whole;
			wnd += " numerator:";
			wnd += numerator;
			wnd += " denominator:";
			wnd += denominator;
		}
		
		else if (b != -1) {
			//System.out.println("This has run");
			fOne = input.substring(0, b);
			fTwo = input.substring(b + 3, input.length());
			//System.out.print(fOne);
			//System.out.print(fTwo);
			//System.out.println("This has completed");
			e = fTwo.indexOf("_");
			if (e != -1) {
				whole = fTwo.substring(0, e);
			}
			g = fTwo.length();
			f = fTwo.indexOf("/");
			if (f != -1) {
				numerator = fTwo.substring(e + 1, f);
				denominator = fTwo.substring(f + 1, g);
			}
			if (f == -1) {
				whole = fTwo;
			}
			h = fOne.indexOf("_");
			if (h != -1) {
				wholeOne = fOne.substring(0, e);
			}
			i = fOne.length();
			j = fOne.indexOf("/");
			if (j != -1) {
				numeratorOne = fOne.substring(h + 1, j);
				denominatorOne = fOne.substring(j + 1, i);
			}
			if (j == -1) {
				wholeOne = fOne;
			}
			wnd += "whole:";
			wnd += whole;
			wnd += " numerator:";
			wnd += numerator;
			wnd += " denominator:";
			wnd += denominator;
		}
		
		else if (c != -1) {
			//System.out.println("This has run");
			fOne = input.substring(0, c);
			fTwo = input.substring(c + 3, input.length());
			//System.out.print(fOne);
			//System.out.print(fTwo);
			//System.out.println("This has completed");
			e = fTwo.indexOf("_");
			if (e != -1) {
				whole = fTwo.substring(0, e);
			}
			g = fTwo.length();
			f = fTwo.indexOf("/");
			if (f != -1) {
				numerator = fTwo.substring(e + 1, f);
				denominator = fTwo.substring(f + 1, g);
			}
			if (f == -1) {
				whole = fTwo;
			}
			h = fOne.indexOf("_");
			if (h != -1) {
				wholeOne = fOne.substring(0, e);
			}
			i = fOne.length();
			j = fOne.indexOf("/");
			if (j != -1) {
				numeratorOne = fOne.substring(h + 1, j);
				denominatorOne = fOne.substring(j + 1, i);
			}
			if (j == -1) {
				wholeOne = fOne;
			}
			wnd += "whole:";
			wnd += whole;
			wnd += " numerator:";
			wnd += numerator;
			wnd += " denominator:";
			wnd += denominator;
		}
		
		else if (d != -1) {
			//System.out.println("This has run");
		    fOne = input.substring(0, d);
			fTwo = input.substring(d + 3, input.length());
			//System.out.print(fOne);
			//System.out.print(fTwo);
			//System.out.println("This has completed");
			e = fTwo.indexOf("_");
			if (e != -1) {
				whole = fTwo.substring(0, e);
			}
			g = fTwo.length();
			f = fTwo.indexOf("/");
			if (f != -1) {
				numerator = fTwo.substring(e + 1, f);
				denominator = fTwo.substring(f + 1, g);
			}
			if (f == -1) {
				whole = fTwo;
			}
			h = fOne.indexOf("_");
			if (h != -1) {
				wholeOne = fOne.substring(0, e);
			}
			i = fOne.length();
			j = fOne.indexOf("/");
			if (j != -1) {
				numeratorOne = fOne.substring(h + 1, j);
				denominatorOne = fOne.substring(j + 1, i);
			}
			if (j == -1) {
				wholeOne = fOne;
			}
			wnd += "whole:";
			wnd += whole;
			wnd += " numerator:";
			wnd += numerator;
			wnd += " denominator:";
			wnd += denominator;
		}
		
		else {
			System.out.println("None ran");
		}
    return wnd;
}

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int fONE (String fOne) {
		e = fOne.indexOf("_");
		if (e != -1) {
			whole = fOne.substring(0, e);
		}
		g = fOne.length();
		f = fOne.indexOf("/");
		if (f != -1) {
			numerator = fOne.substring(e + 1, f);
			denominator = fOne.substring(f + 1, g);
		}
		if (f == -1) {
			whole = fOne;
		}
		h = fOne.indexOf("_");
		if (h != -1) {
			wholeOne = fOne.substring(0, e);
		}
		i = fOne.length();
		j = fOne.indexOf("/");
		if (j != -1) {
			numeratorOne = fOne.substring(h + 1, j);
			denominatorOne = fOne.substring(j + 1, i);
		}
		if (j == -1) {
			wholeOne = fOne;
		}
		wnd += "whole:";
		wnd += whole;
		wnd += " numerator:";
		wnd += numerator;
		wnd += " denominator:";
		wnd += denominator;
    	return ;
    }
    public static String tester (String input) {
    // TODO: Implement this function to produce the solution to the input
    String fOne = "";
    String fTwo = "";
	int a = input.indexOf(" * ");
	int b = input.indexOf(" / ");
	int c = input.indexOf(" + ");
	int d = input.indexOf(" - ");
	int e;
	int f;
	int g;
	int h;
	int i;
	int j;
	int k;
	int l;
	int m;
	String wnd = "";
	String whole = "0";
	String wholeOne = "0";
	String numerator = "0";
	String numeratorOne = "0";
	String denominator = "1";
	String denominatorOne = "1";
	String sum = "";

	if (a != -1) {
		//System.out.println("This has run");
		fOne = input.substring(0, a);
		fTwo = input.substring(a + 3, input.length());
		//System.out.print(fOne);
		//System.out.print(fTwo);
		//System.out.println("This has completed");
		e = fTwo.indexOf("_");
		if (e != -1) {
			whole = fTwo.substring(0, e);
		}
		g = fTwo.length();
		f = fTwo.indexOf("/");
		if (f != -1) {
			numerator = fTwo.substring(e + 1, f);
			denominator = fTwo.substring(f + 1, g);
		}
		if (f == -1) {
			whole = fTwo;
		}
		
		h = fOne.indexOf("_");
		if (h != -1) {
			wholeOne = fOne.substring(0, e);
		}
		i = fOne.length();
		j = fOne.indexOf("/");
		if (j != -1) {
			numeratorOne = fOne.substring(h + 1, j);
			denominatorOne = fOne.substring(j + 1, i);
		}
		if (j == -1) {
			wholeOne = fOne;
		}
		wnd += "whole:";
		wnd += whole;
		wnd += " numerator:";
		wnd += numerator;
		wnd += " denominator:";
		wnd += denominator;
		
	}
	
	else if (b != -1) {
		//System.out.println("This has run");
		fOne = input.substring(0, b);
		fTwo = input.substring(b + 3, input.length());
		//System.out.print(fOne);
		//System.out.print(fTwo);
		//System.out.println("This has completed");
		e = fTwo.indexOf("_");
		if (e != -1) {
			whole = fTwo.substring(0, e);
		}
		g = fTwo.length();
		f = fTwo.indexOf("/");
		if (f != -1) {
			numerator = fTwo.substring(e + 1, f);
			denominator = fTwo.substring(f + 1, g);
		}
		if (f == -1) {
			whole = fTwo;
		}
		wnd += "whole:";
		wnd += whole;
		wnd += " numerator:";
		wnd += numerator;
		wnd += " denominator:";
		wnd += denominator;
	}
	
	else if (c != -1) {
		//System.out.println("This has run");
		fOne = input.substring(0, c);
		fTwo = input.substring(c + 3, input.length());
		//System.out.print(fOne);
		//System.out.print(fTwo);
		//System.out.println("This has completed");
		e = fTwo.indexOf("_");
		if (e != -1) {
			whole = fTwo.substring(0, e);
		}
		g = fTwo.length();
		f = fTwo.indexOf("/");
		if (f != -1) {
			numerator = fTwo.substring(e + 1, f);
			denominator = fTwo.substring(f + 1, g);
		}
		if (f == -1) {
			whole = fTwo;
		}
		wnd += "whole:";
		wnd += whole;
		wnd += " numerator:";
		wnd += numerator;
		wnd += " denominator:";
		wnd += denominator;
	}
	
	else if (d != -1) {
		//System.out.println("This has run");
	    fOne = input.substring(0, d);
		fTwo = input.substring(d + 3, input.length());
		//System.out.print(fOne);
		//System.out.print(fTwo);
		//System.out.println("This has completed");
		e = fTwo.indexOf("_");
		if (e != -1) {
			whole = fTwo.substring(0, e);
		}
		g = fTwo.length();
		f = fTwo.indexOf("/");
		if (f != -1) {
			numerator = fTwo.substring(e + 1, f);
			denominator = fTwo.substring(f + 1, g);
		}
		if (f == -1) {
			whole = fTwo;
		}
		wnd += "whole:";
		wnd += whole;
		wnd += " numerator:";
		wnd += numerator;
		wnd += " denominator:";
		wnd += denominator;
	}
	
	else {
		System.out.println("None ran");
	}
return wnd;
}
}
