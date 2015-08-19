package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {
	
	/**
	 * (Combine two lists) Write a method that returns the union of two array lists of
	 * integers using the following header:
	 * public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
	 * {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
	 * each with five integers, and displays their union. The numbers are separated by
	 * exactly one space in the output.
	 * 
	 * Enter five integers for list1: 3 5 45 4 3
	 * Enter five integers for list2: 33 51 5 4 13
	 * The combined list is 3 5 45 4 3 33 51 5 4 13
	 */
	
	/** Method that combine two lists into 3rd one */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		/** Create a new ArrayList to store other two lists into it */
		ArrayList<Integer> list3 = new ArrayList<>();
		
		/** Add list1 into list3 */
		list3.addAll(list1);
		
		/** Add list2 into list3 */
		list3.addAll(list2);
		
		return list3; // return list3
	}
	
///////////////////////////////////////////////////////////
	                  /** Main */
///////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create two ArrayLists of integers */
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		/** Prompt the user to enter 5 numbers into first ArrayList */
		System.out.println("Unesite 5 brojeva u prvu listu: ");
		for(int i = 0; i < 5; i++) {
			list1.add(input.nextInt()); // add numbers into list1
		}
		
		/** Prompt the user to enter 5 numbers into second list */
		System.out.println("Unesite 5 brojeva u drugu listu: ");
		for(int i = 0; i < 5; i++) {
			list2.add(input.nextInt()); // add numbers into list2
		}
		
		/** Invoke union() method and display combined list */
		System.out.println(union(list1, list2));
		
		input.close();
	}

}
