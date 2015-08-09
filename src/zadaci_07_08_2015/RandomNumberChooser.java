package zadaci_07_08_2015;

import java.util.Random;

public class RandomNumberChooser {
	
	/**
	 * Zadatak: 2.
	 * (Random number chooser) Write a method that returns a random number between
	 * 1 and 54, excluding the numbers passed in the argument. The method header is
	 * specified as follows:
	 * 
	 * public static int getRandom(int... numbers)
	 */

	public static int getRandom(int... numbers) {
		
		/** Random class */
		Random rand = new Random();
		
		int n = 0; // Returning number
		
		boolean b = true; // Initially set boolean to true
		
		/** Set while loop to true */
		while(b == true) {
			/** Get random number from range 1 - 54 */
			int number = 1 + rand.nextInt(54);
			/** Go through foreach loop of numbers from methods arguments */
			for(int num: numbers) {
				if(num == number) { // if number from array equals random number
					b = true; // set boolean to true, and continue with while loop
					break;
				} else { // otherwise 
					n = number; // set returning number to random number
					b = false; // and exit the while loop
				}
			}
		}
		
		return n; // return obtained random number
		
	}
	
/////////////////////////////////////////////////////////
	                 /** Main */
/////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		/** Assign method's arguments to the randNumber variable */
		int randNumber = getRandom(3, 1, 5, 10, 15, 20);
		
		/** Display result */
		System.out.println(randNumber);
		
	}

}

