package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
	
	/**
	 * Zadatak: 3
	 * 
	 * (Sum ArrayList) Write the following method that returns the sum of all numbers
	 * in an ArrayList:
	 * public static double sum(ArrayList<Double> list)
	 * Write a test program that prompts the user to enter 5 numbers, stores them in an
	 * array list, and displays their sum.
	 */
	
	/** Method that sum numbers in ArrayList */
	public static double sum(ArrayList<Double> list) {
		double sum = 0; // Declare sum
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i); // sum numbers from the list
		}
		return sum; // return result
	}
	
///////////////////////////////////////////////////////////
	               /** Main */
///////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create ArrayList of Double numbers */
		ArrayList<Double> list = new ArrayList<>();
		
		/** Prompt the user to enter 5 numbers */
		System.out.println("Enter 5 numbers: ");
		for(int i = 0; i < 5; i++) {
			double numbers = input.nextDouble();
			list.add(numbers); // store numbers into ArrayList
		}
		
		/** Display result */
		System.out.println("Sum of numbers: " + sum(list));
		
		input.close();
	}

}
