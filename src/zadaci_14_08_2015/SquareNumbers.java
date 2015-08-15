package zadaci_14_08_2015;

import java.math.BigInteger;

public class SquareNumbers {
	
	/**
	 * Zadatak: 2
	 * 
	 * (Square numbers) Find the first ten square numbers that are greater than
	 * Long.MAX_VALUE. A square number is a number in the form of n2. For example,
	 * 4, 9, and 16 are square numbers. Find an efficient approach to run your
	 * program fast.
	 */

	public static void main(String[] args) {
		
		/** Obtain max long value number */
		Long lMax = new Long(Long.MAX_VALUE);
		
		/** Format the square number of the long max value number */
		String strSqrt = String.format("%.0f", Math.sqrt(lMax));
		
		/** Create BigInteger class and add obtained square number of the max value to it */
		BigInteger sqrtMaxLong = new BigInteger(strSqrt);
		
		/** Create BigInteger's result, for adding result of the multiplying square numbers */
		BigInteger result = new BigInteger("0");
		
		int counter = 0;
		
	    while(counter < 10) {
	    	
	    	/** Add to the BigInteger's "result" obtained square number */
	    	result = sqrtMaxLong.multiply(sqrtMaxLong);
	    	
	    	BigInteger maxBigInt = new BigInteger("" + lMax);
	    	
	    	/** If the result of two squared numbers greater than Long.MAX_VALUE number... */
	    	if(result.compareTo(maxBigInt) >= 0) {
	    		/** ...print result */
	    		System.out.println(result);
	    		counter++; // Increment counter for while loop condition
	    	}
	    	/** Adds value to the sqrtMaxLong incremented by 1 */
	    	sqrtMaxLong = sqrtMaxLong.add(BigInteger.ONE);
	    }
		
	}
}
