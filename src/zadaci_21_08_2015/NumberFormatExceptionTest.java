package zadaci_21_08_2015;

import java.util.Scanner;

public class NumberFormatExceptionTest {

	/**
	 * Zadatak: 1
	 * 
	 * (NumberFormatException) Write the bin2Dec(String binaryString)
	 * method to convert a binary string into a decimal number. Implement the
	 * bin2Dec method to throw a NumberFormatException if the string is not a
	 * binary string.
	 */
	
	 public static int bin2Dec(String binaryString) {
		 int sum = 0;
		 try {
			 for(int i = 0; i < binaryString.length(); i++) {
				 /** If input corresponds to 1 or 0... */
				 if(binaryString.charAt(i) == '1' || binaryString.charAt(i) == '0'){
					/** ...then get sum */ 
			        sum = (int)(sum + Math.pow(2, binaryString.length() - 1 - i));
			     } else {
			    	 /** otherwise, throw an exception for incorrect input */
			    	 NumberFormatException ex = new NumberFormatException();
			    	 throw ex;
			     }
			 }
		 /** Catch exception for incorrect input and display message to the user */	 
		 } catch(NumberFormatException ex) {
			 System.out.println(ex + " Incorrect input! Binary input must contain only 0's and 1's.");
		 }
		 return sum;
     }
	 
/////////////////////////////////////////////////////////////
	                  /** Main */
/////////////////////////////////////////////////////////////	 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter binary string */
		System.out.println("Enter binary number string: ");
		
		String bin = input.next();
		
		/** Invoke bin2Dec() method and display result */
		System.out.println(bin2Dec(bin));
		
		input.close();
	}

}
