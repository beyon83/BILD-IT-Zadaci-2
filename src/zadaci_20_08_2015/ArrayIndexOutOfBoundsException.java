package zadaci_20_08_2015;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
	
	/**
	 * Zadatak: 4
	 * 
	 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
	 * requirements:
	 * ■ Creates an array with 100 randomly chosen integers.
	 * ■ Prompts the user to enter the index of the array, then displays the corresponding
	 * element value. If the specified index is out of bounds, display the
	 * message Out of Bounds.
	 */

	public static void main(String[] args) {
		
		/** Create Random object */
		Random rand = new Random();
		
		Scanner input = new Scanner(System.in);
		
		/** Create array of 100 integers */
		int[] array = new int[100];
		
		/** Assign 100 random integers to the array */
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(99);
		}
		
		int index = 0;
		
		try {
			/** Prompt the user to enter a index of an array */
			System.out.println("Enter index of array's element: ");
			index = input.nextInt();
			
			/** Display array of 100 random integers */
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
			/** Display input's index of an array */
			System.out.println("\nAt index " + index + " is integer: " + array[index]);
			
		/** If number is greater or lower than size of the array, catch OutOfBounds exception */	
		} catch(IndexOutOfBoundsException ex) {
			System.out.println();
			System.out.println("\nInput " + index + " is out of bounds! " + ex);
		}
		
		input.close();
	}

}
