package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionTest {
	
	/**
	 * Zadatak: 3
	 * 
	 *  (InputMismatchException) Write a program that prompts the user to read
	 *  two integers and displays their sum. Your program should prompt the user to
	 *  read the number again if the input is incorrect.
	 */

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create boolean and set it initially to true */
		boolean continueInput = true;
		
		int sum = 0; // sum of two numbers
		
		do {
			try {
				/** Prompt the user to enter two integers */
				System.out.println("Enter first integer: ");
				int number1 = input.nextInt();
				System.out.println("Enter second integer: ");
				int number2 = input.nextInt();
				
				/** Sum two integers */
				sum = number1 + number2;
				
				System.out.println("Sum of two numbers is: " + sum);
				
				/** If everything is ok, set boolean to false, and exit do-while loop */
				continueInput = false;
			} catch(InputMismatchException ex) {
				/** If input is not integer, catch exception and ask user to try again */
				System.out.println("Try again. (" + ex + ". Incorrect input: an integer is required!)");
				input.nextLine(); // Discard input
			}
		} while(continueInput);
		
		
		input.close();
		
	}

}
