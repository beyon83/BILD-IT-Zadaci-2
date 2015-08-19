package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
	
	/**
	 * Zadatak: 2
	 * 
	 * (Sort ArrayList) Write the following method that sorts an ArrayList of
	 * numbers:
	 * public static void sort(ArrayList<Integer> list)
	 * Write a test program that prompts the user to enter 5 numbers, stores them in an
	 * array list, and displays them in increasing order.
	 */

	/** Method for sorting ArrayList using bubble-sort algorithm */
	public static void sort(ArrayList<Integer> list) {
		
		/** Use Collections.sort() method for simple way of sorting ArrayList */
		//  java.util.Collections.sort(list);
		
		/** Sorting an ArrayList using the "bubble sort" algorithm */
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(i)) {
					Integer temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	
/////////////////////////////////////////////////////////
	                /** Main */
/////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create ArrayList */
		ArrayList<Integer> list = new ArrayList<>();
		
		/** Prompt the user to enter 5 numbers */
		System.out.println("Unesite 5 brojeva: ");
		for(int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		/** Call sort method */
		sort(list);
		
		/** Display sorted numbers */
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		input.close();
	}

}
