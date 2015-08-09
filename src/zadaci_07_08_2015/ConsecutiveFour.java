package zadaci_07_08_2015;

import java.util.Scanner;

public class ConsecutiveFour {
	
	/**
	 * Zadatak: 3.
	 * (Pattern recognition: consecutive four equal numbers) Write the following
	 * method that tests whether the array has four consecutive numbers with the same
	 * value.
	 * 
	 * public static boolean isConsecutiveFour(int[] values)
	 * 
	 * Write a test program that prompts the user to enter a series of integers and displays
	 * if the series contains four consecutive numbers with the same value. Your
	 * program should first prompt the user to enter the input size—i.e., 
	 * the number of values in the series. Here are sample runs:
	 * 
	 * Enter the number of values: 8
	 * Enter the values: 3 4 5 5 5 5 4 5
	 * The list has consecutive fours
	 * 
	 * Enter the number of values: 9
	 * Enter the values: 3 4 5 5 6 5 5 4 5
	 * The list has no consecutive fours
	 */
	
	public static boolean isConsecutiveFour(int[] values) {
		int counter = 1; // set counter to 1
		/** Go through the array and compare values for equality */
		for(int i = 0; i < values.length; i++) {
			for(int j = i + 1; j < values.length; j++) {
				if(values[i] == values[j]) { // if values are equal
					counter++; // increase counter by +1
				} else {
					counter = 1; // otherwise, reset counter to 1
				}
				if(counter >= 4) { // if same values are counted more than 4 times in a row
					return true;   // return true
				}
			}
		}
		return false; // otherwise return false
	}
	
/////////////////////////////////////////////////////
	             /** Main */
/////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter input of an array */
		System.out.println("Enter a input size of an array: ");
		int inputSize = input.nextInt();
		
		/** Create an array of numbers */
		int[] array = new int[inputSize];
		
		System.out.println("Enter a series of integers: ");
		
		/** Enter series of numbers into array */
		for(int i = 0; i < inputSize; i++) {
			array[i] = input.nextInt();
		}
		
		/** Display result */
		if(isConsecutiveFour(array) == true) {
			System.out.println("The list has consecutive fours.");
		} else {
			System.out.println("The list has no consecutive fours.");
		}
		
		input.close();
	}

}