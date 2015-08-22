package zadaci_21_08_2015;

public class OutOfMemoryErr {
	
	/**
	 * Zadatak: 2
	 * 
	 * (OutOfMemoryError) Write a program that causes the JVM to throw an
	 * OutOfMemoryError and catches and handles this error.
	 */

	public static void main(String[] args) {
		
		try {
			/** Create an array with size of Integer max value */
			int[] array = new int[Integer.MAX_VALUE];
			/** Iterate through the array and increment it by +1 */
			for(int i = 0; i < array.length; i++) {
				array[i]++;
			}
		/** Catch error and display error message */	
		} catch(OutOfMemoryError ex) {
			System.out.println("Out of memory error " + ex);
		}
		
	}

}
