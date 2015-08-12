package zadaci_12_08_2015;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class DisplayingPrimeFactors {
	
	/**
	 * Zadatak: 4
	 * 
	 *  (Displaying the prime factors) Write a program that prompts the user to enter
	 *  a positive integer and displays all its smallest factors in decreasing order. For
	 *  example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
	 *  2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
	 *  retrieve and display them in reverse order.
	 */
	
/////////////////////////////////////////////////////
	                /** Main */
/////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to enter positive integer */
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		
		/** Create Stack class */
		Stack<Integer> stack = new Stack<>();
		
		int j = 2;
		
		/** Keep looping while inputs number is divisible by 2 */
		while(number % 2 == 0) {
			number = number / j; 
			stack.add(j); // add numbers to the stack
		}
		
		for(int i = 3; i <= number; i = i + 2){
			/** Loop through while number is divisible by i */
	        while(number % i == 0){
	        	number = number / i;
	            j = i;
	            stack.add(j); // add numbers to the stack
	        }
	    }
		
		/** Reverse numbers from the stack */
		Collections.reverse(stack);
		
		/** Display numbers */
		for(Integer s: stack) {
			System.out.print(s + " ");
		}
		
		input.close();
	}
}
