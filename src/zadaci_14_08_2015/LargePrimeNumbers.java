package zadaci_14_08_2015;

import java.math.BigInteger;

public class LargePrimeNumbers {
	
	/**
	 * Zadatak: 3
	 * 
	 * (Large prime numbers) Write a program that finds five prime numbers larger
	 * than Long.MAX_VALUE.
	 */
	
	public static void main(String[] args) {
		
		/** Obtain max long value number */
		Long lMax = new Long(Long.MAX_VALUE);
		
		/** Create BigInteger's class that contains Long.MAX_VALUE number */
		BigInteger primeLong = new BigInteger("" + lMax);
		
		int counter = 0; // Counter for while loop condition
	    
		System.out.println("First 5 prime numbers larger than Long.MAX_VALUE are: \n");
		
		while(counter < 5) {
			/** Check if number is prime using isProbablePrime() method */
			if(primeLong.isProbablePrime(1)) {
				System.out.println(primeLong);
				counter++; // Increment counter by +1
			}  
			/** Adds value to the primeLong incremented by 1 */
			primeLong = primeLong.add(BigInteger.ONE);
		}
		
	}
}
