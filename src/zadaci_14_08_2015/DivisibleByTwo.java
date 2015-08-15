package zadaci_14_08_2015;

import java.math.BigDecimal;

public class DivisibleByTwo {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits 
	 * that are divisible by 2 or 3.
	 */

	public static void main(String[] args) {
		
		/** Create 50 decimal digit using BigDecimal class */
		BigDecimal fiftyDecDigit = new BigDecimal("10000000000000000000000000000000000000000000000000");
		
		/** Create BigDecimal object with value of 2 */
		BigDecimal two = new BigDecimal(2);
		
		/** Create BigDecimal object with value of 3 */
		BigDecimal three = new BigDecimal(3);
		
		int counter = 0; // Counter for while loop condition
		
		System.out.println("First ten 50 decimal digits divisible by 2 or 3 are: ");
		
		while(counter < 10) {

			/** Use remainder() method to obtain remainder by dividing fiftyDecDigit and number two */
			BigDecimal remainderTwo = fiftyDecDigit.remainder(two);
			
			/** Use remainder() method to obtain remainder by dividing fiftyDecDigit and number three */
			BigDecimal remainderThree = fiftyDecDigit.remainder(three);
			
			/** Create BigDecimal with value zero */
			BigDecimal zero = BigDecimal.ZERO;
			
			/** If remainder of 2 and 3 are equals to 0 */
			if (remainderTwo.equals(zero) || remainderThree.equals(zero)) {
				/** Display result */
				System.out.println(fiftyDecDigit);
				counter++; // Increment counter by +1
			}
			/** Increment value by 1 and add it to the fiftyDecDigit */
			fiftyDecDigit = fiftyDecDigit.add(new BigDecimal(1));
		}
		
	}
}
