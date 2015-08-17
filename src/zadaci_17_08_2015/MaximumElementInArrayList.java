package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementInArrayList {
	
	/**
	 * Zadatak: 3
	 * 
	 * (Maximum element in ArrayList) Write the following method that returns the
	 * maximum value in an ArrayList of integers. The method returns null if the
	 * list is null or the list size is 0.
	 * public static Integer max(ArrayList<Integer> list)
	 * Write a test program that prompts the user to enter a sequence of numbers ending
	 * with 0, and invokes this method to return the largest number in the input.
	 */
	
	/** Method that returns maximum element from ArrayList */
	public static Integer max(ArrayList<Integer> list) {
		Integer max = null;
		for(int i = 0; i < list.size(); i++) {
			if(!list.isEmpty()) {
				return max = Collections.max(list);
			} 
		}
		return max;
	}
	
////////////////////////////////////////////////////////
					/** Main */
////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Create ArrayList of Integers */
		ArrayList<Integer> list = new ArrayList<>();
		
		/** Prompt the user to enter a sequence of numbers */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite sekvencu brojeva. Program zavrsava sa unosom 0");
		
		int number;
		
		do {
			number = input.nextInt();
			if(number != 0) {
				/** If input's number is not 0, add number to the ArrayList */
				list.add(number);
			}
		} while(number != 0);
		
		/** Display result */
		System.out.println(max(list));
		
		input.close();
	}
}
