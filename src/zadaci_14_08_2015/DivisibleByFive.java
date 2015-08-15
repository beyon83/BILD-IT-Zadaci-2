package zadaci_14_08_2015;

import java.math.BigInteger;

public class DivisibleByFive {
	
	/**
	 * Zadatak: 5
	 * 
	 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
	 * that are divisible by 5 or 6.
	 */

	public static void main(String[] args) {
		
		/** Obtain max long value number */
		Long lMax = new Long(Long.MAX_VALUE);
		
		/** Create BigInteger's class that contains Long.MAX_VALUE number */
		BigInteger lMaxBigInt = new BigInteger("" + lMax);
		
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");
	      
		int counter = 0; // Counter for while loop condition
		
		System.out.println("First ten numbers greater than long.MAX_VALUE that are divisible by 5 or 6 are: ");
		
		while(counter < 10) {

			/** Use remainder() method to obtain remainder by dividing lMaxBigInt and number fiev */
			BigInteger remainderFive = lMaxBigInt.remainder(five);
			
			/** Use remainder() method to obtain remainder by dividing lMaxBigInt and number six */
			BigInteger remainderSix = lMaxBigInt.remainder(six);
			
			/** Create BigDecimal with value zero */
			BigInteger zero = BigInteger.ZERO;
			
			/** If remainder of five are equal to zero, or remainder of six are equal to zero... */
			if (remainderFive.equals(zero) || remainderSix.equals(zero)) {
				/** Display result */
				System.out.println(lMaxBigInt);
				counter++; // Increment counter by +1
			}
			/** Adds value to the lMaxBigInt incremented by +1 */
			lMaxBigInt = lMaxBigInt.add(BigInteger.ONE);
		}
		
	}

}
