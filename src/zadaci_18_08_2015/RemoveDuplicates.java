package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Remove duplicates) Write a method that removes the duplicate elements from
	 * an array list of integers using the following header:
	 * public static void removeDuplicate(ArrayList<Integer> list)
	 * Write a test program that prompts the user to enter 10 integers to a list and displays
	 * the distinct integers separated by exactly one space.
	 * 
	 * Enter ten integers: 34 5 3 5 6 4 33 2 2 4
	 * The distinct integers are 34 5 3 6 4 33 2
	 */
	
	/** Method that removes duplicate numbers */
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					/** If number i == number j, remove that number using remove() method */
					list.remove(i);
					i = 0; // reset i to 0 to start checking from the beginning
					j = 0; // reset j as well
				}
			}
		}
	}

///////////////////////////////////////////////////////////////
	                  /** Main */
///////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		/** Create ArrayList of integers */
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter 10 numbers */
		System.out.println("Unesite 10 brojeva: ");
		
		for(int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		
		/** Invoke removeDuplicate() method */
		removeDuplicate(list);
		
		/** Display distinct numbers */
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		input.close();
	}

}
