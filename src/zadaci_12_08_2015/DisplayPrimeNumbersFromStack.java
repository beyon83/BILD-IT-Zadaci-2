package zadaci_12_08_2015;

import java.util.Collections;
import java.util.Stack;

public class DisplayPrimeNumbersFromStack {
	
	/**
	 * Zadatak: 5
	 * 
	 * (Displaying the prime numbers) Write a program that displays all the prime
	 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
	 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
	 * reverse order.
	 */
	
	/** Check for prime numbers */
	public static boolean isPrime(int number) {
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) { // if number is divisible by i
				return false; // number is not prime
			}
		}
		return true; // otherwise, number "i" is a prime number
	}

	public static void main(String[] args) {
		
		/** Create Stack list */
		Stack<Integer> stack = new Stack<>();
		
		/** Iterate through first 120 numbers */
		for(int i = 3; i < 120; i++) {
			/** Call isPrime() method to ckeck if number is prime */
			if(isPrime(i)) {
				stack.add(i); // if number is prime, assign it to the stack
			}
		}
		
		/** Reverse numbers in the stack */
		Collections.reverse(stack);
		
		/** Display first 120 prime numbers in reverse order */
		System.out.println("All prime numbers up to 120 are: ");
		for(Integer s: stack) {
			System.out.print(s + " ");
		}
		
	}

}
