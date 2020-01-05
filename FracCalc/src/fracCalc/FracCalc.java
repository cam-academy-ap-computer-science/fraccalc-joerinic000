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
    		String answer;
    		String s = "";
    		String quit = "quit";
    		System.out.println("This calculator will whole numbers, fractions, and mixed numbers and output the answer.");
    		System.out.println("Please use the format: Whole Number_Numerator/Denominator (Operator) Whole Number_Numerator/Denominator.");
			System.out.print("What is your equation? ");
    		s = userInput.nextLine();
    		while (!(s.toLowerCase().equals(quit))) {
    				answer = produceAnswer(s);
    				System.out.println("Answer: " + answer);
    				System.out.print("What is your equation? ");
        			s = userInput.nextLine();
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
    	int a = input.indexOf(" * "); // Multiplication check
    	int b = input.indexOf(" / "); // Division check
    	int c = input.indexOf(" + "); // Addition check
    	int d = input.indexOf(" - "); // Subtraction check
    	int e; // fTwo's "_" check
    	int f; // fTwo's "/" check
    	int g; // fTwo's length
    	int h; // fOne's "_" check
    	int i; // fOne's length
    	int j; // fOne's "/" check
    	int frac1; // Fraction 1
    	int frac2; // Fraction 2
    	int m; // Not used yet
    	int w1 = 0; // Whole one
    	int n1 = 0; // Numerator one
    	int d1 = 1; // Denominator one
    	int w2 = 0; // Whole two
    	int n2 = 0; // Numerator two
    	int d2 = 1; // Denominator two
    	String wnd = ""; // Whole, Numerator, Denominator
    	String whole = "0";
    	String numerator = "0";
    	String wholeOne = "0";
    	String numeratorOne = "0";
    	String denominator = "1";
    	String denominatorOne = "1";
    	String answer = "";
    	
    	if (a != -1) { //Multiplication
    		//String separation
    		fOne = input.substring(0, a);
    		fTwo = input.substring(a + 3, input.length());
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
    			wholeOne = fOne.substring(0, h);
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
    		//Strings to Ints
    		w1 = Integer.parseInt(wholeOne);
    		n1 = Integer.parseInt(numeratorOne);
    		d1 = Integer.parseInt(denominatorOne);
    		
    		w2 = Integer.parseInt(whole);
    		n2 = Integer.parseInt(numerator);
    		d2 = Integer.parseInt(denominator);
    		//Negative distribution
    		if (w1 < 0) { 
    			n1 *= -1;
    		}
    		
    		if (w2 < 0) { 
    			n2 *= -1;
    		}
    		
    		// Makes improper
    		frac1 = (w1 * d1) + n1;
    		frac2 = (w2 * d2) + n2;
    		//Multipication
    		d1 *= d2;
    		n1 = frac1 * frac2;
    		w1 = n1 / d1;
    		n1 = n1 % d1;
    		//Negative distribution
    		if (w1 < 0 && n1 < 0) {
    			n1 *= -1;
    		}
    		//Mixed Fraction Simplification
    		if (n1 > d1 || n1 == d1) {
    			while(n1 > d1) {
    				n1 -= d1;
    				w1++;
    			}
    		}
    		//Answer Formating
    		if (n1 == 0) {
    			answer = w1 + "";
    		}
    		else {
    			answer = w1 + "_" + n1 + "/" + d1;
    		}
    	}
    	
    	else if (b != -1) { //Division
    		fOne = input.substring(0, b);
    		fTwo = input.substring(b + 3, input.length());
    		e = fTwo.indexOf("_");
    		if (e != -1) {
    			whole = fTwo.substring(0, e);
    		}
    		//String Separation
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
    			wholeOne = fOne.substring(0, h);
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
    		//Converts strings into ints
    		w1 = Integer.parseInt(wholeOne);
    		n1 = Integer.parseInt(numeratorOne);
    		d1 = Integer.parseInt(denominatorOne);
    		
    		w2 = Integer.parseInt(whole);
    		n2 = Integer.parseInt(numerator);
    		d2 = Integer.parseInt(denominator);
    		//Negative distribution
    		if (w1 < 0) { 
    			n1 *= -1;
    		}
    		
    		if (w2 < 0) { 
    			n2 *= -1;
    		} 
    		
    		//Makes improper
    		n1 = (w1 * d1) + n1;
    		n2 = (w2 * d2) + n2;
    		
    		//Flips second fraction
    		int temp = n2;
    		n2 = d2;
    		d2 = temp;
    		
    		w1 = 0;
    		//Multiplication
    		w1 *= w2;
    		n1 *= n2;
    		d1 *= d2;
    		
    		if (w1 < 0 && n1 < 0) {
    			n1 *= -1;
    		}
    		if (n1 < 0 && d1 < 0) {
    			d1 *= -1;
    			n1 *= -1;
    		}
    		
    		if (n1 > d1 || n1 == d1) {
    			while(n1 > d1) {
    				n1 -= d1;
    				w1++;
    			}
    		}
    		//Formatting answers
    		if (n1 == 0) {
    			answer = w1 + "";
    		}
    		else {
    			answer = w1 + "_" + n1 + "/" + d1;
    		}
    		}
    	
    	else if (c != -1) { //Addition
    		fOne = input.substring(0, c);
    		fTwo = input.substring(c + 3, input.length());
    		e = fTwo.indexOf("_");
    		if (e != -1) {
    			whole = fTwo.substring(0, e);
    		}
    		//String Separation
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
    			wholeOne = fOne.substring(0, h);
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
    		//Strings to Ints
    		w1 = Integer.parseInt(wholeOne);
    		n1 = Integer.parseInt(numeratorOne);
    		d1 = Integer.parseInt(denominatorOne);
    		
    		w2 = Integer.parseInt(whole);
    		n2 = Integer.parseInt(numerator);
    		d2 = Integer.parseInt(denominator);
    		//Negative distribution
    		if (w1 < 0) { 
    			n1 *= -1;
    		}
    		
    		if (w2 < 0) { 
    			n2 *= -1;
    		}
    		//LCD calculation
    		if (d1 != d2) {
    			int temp = d1;
    			d1 = d1 * d2;
    			n1 = n1 * d2;
    			d2 = d2 * temp;
    			n2 = n2 * temp;
    		}
    		//Addition
    		n1 += n2;
    		w1 += w2;
    		w1 += (n1/d1);
    		n1 = n1 % d1;
    		
    		if (w1 < 0 && n1 < 0) {
    			n1 *= -1;
    		}
    		//Keeping Mixed Numbers
    		if (n1 > d1 || n1 == d1) {
    			while(n1 > d1) {
    				n1 -= d1;
    				w1++;
    			}
    		}
    		//Answer formating
    		if (n1 == 0) {
    			answer = w1 + "";
    		}
    		else {
    			answer = w1 + "_" + n1 + "/" + d1;
    		}
    		}
    	
    	else if (d != -1) { //Subtraction
    	    fOne = input.substring(0, d);
    		fTwo = input.substring(d + 3, input.length());
    		e = fTwo.indexOf("_");
    		if (e != -1) {
    			whole = fTwo.substring(0, e);
    		}
    		//String Separation
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
    			wholeOne = fOne.substring(0, h);
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
    		//String to Ints
    		w1 = Integer.parseInt(wholeOne);
    		n1 = Integer.parseInt(numeratorOne);
    		d1 = Integer.parseInt(denominatorOne);
    		
    		w2 = Integer.parseInt(whole);
    		n2 = Integer.parseInt(numerator);
    		d2 = Integer.parseInt(denominator);
    		//Negative distribution
    		if (w1 < 0) { 
    			n1 *= -1;
    		}
    		
    		if (w2 < 0) { 
    			n2 *= -1;
    		}
    		//LCD calculation
    		if (d1 != d2) {
    			int temp = d1;
    			d1 = d1 * d2;
    			n1 = n1 * d2;
    			d2 = d2 * temp;
    			n2 = n2 * temp;
    		}
    		//Subtraction
    		n1 -= n2;
    		w1 -= w2;
    		if (n1 < 0) {
    			int temp = n1;
    			w1 -= 1;
    			n1 = d1;
    			n1 -= temp;
    		}
    		//Negative formating
    		if (w1 < 0 && n1 < 0) {
    			n1 *= -1;
    		}
    		//Mixed Fraction Simplification
    		if (n1 > d1 || n1 == d1) {
    			while(n1 > d1) {
    				n1 -= d1;
    				w1++;
    			}
    		}
    		//Answer formating
    		if (n1 == 0) {
    			answer = w1 + "";
    		}
    		else {
    			answer = w1 + "_" + n1 + "/" + d1;
    		}
    		}
    	
    	else {
    		answer = "None Ran";
    	}
    return answer;
}
}
