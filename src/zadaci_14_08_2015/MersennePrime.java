package zadaci_14_08_2015;

import java.math.BigInteger;

public class MersennePrime {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
	 * in the form 2p - 1 for some positive integer p. Write a program that finds
	 * all Mersenne primes with p … 100 and displays the output as shown below.
	 * (Hint: You have to use BigInteger to store the number, because it is too big to
	 * be stored in long. Your program may take several hours to run.)
	 * p 2^p – 1
	 * 2 3
	 * 3 7
	 * 5 31
	 */
	
	/** Method that checks whether is number prime or not */
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			/** If number "i" divisible by number equals 0, then number is not a prime, set false */
			if(number % i == 2) {
				return false;
			}
		}
		return true; // otherwise number is prime, set true
	}
	
//////////////////////////////////////////////////////////
	                  /** Main */
//////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++) {
			
			if(isPrime(i)) { // if number is prime
				
				/** Compute prime numbers using Math.pow() method */
				long mersenneNumber = (long)(Math.pow(2, i)) - 1;
				
				/** Store those numbers into BigInteger's class */
				BigInteger mersenneBigInt = new BigInteger("" + mersenneNumber);
				
				String n = "" + i;
				
				/** Display Mersenne prime numbers */
				if(n.length() < 2) {
					System.out.print(i + " " + mersenneBigInt + "\n");
				} else {
					System.out.print(i + " " + mersenneBigInt); 
				}
			}
		}
		
	}

}
