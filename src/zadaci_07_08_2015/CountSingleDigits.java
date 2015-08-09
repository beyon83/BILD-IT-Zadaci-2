package zadaci_07_08_2015;

import java.util.Random;

public class CountSingleDigits {
	
	/**
	 * Zadatak: 1.
	 * (Count single digits) Write a program that generates 100 random integers between
	 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
	 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
	 */

	public static void main(String[] args) {
		
		/** Initialize random class */
		Random rand = new Random();
		
		int[] numbers = new int[100]; // array of random numbers
		int[] countNumbers = new int[10]; // counter for numbers
		
		for(int i = 0; i < numbers.length; i++) {
			/** Assign 100 random numbers to the numbers array */
			numbers[i] = rand.nextInt(10); 
		}
		
		for(int i = 0; i < numbers.length; i++) {
			countNumbers[numbers[i]]++; // count occurrences of each number
		}
		
		/** Display result */
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Number " + numbers[i] + " occurred: " + countNumbers[numbers[i]] + " times.");
		}
		
	}

}
