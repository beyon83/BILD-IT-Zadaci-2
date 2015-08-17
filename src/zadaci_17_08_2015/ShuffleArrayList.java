package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleArrayList {
	
	/**
	 * Zadatak: 5
	 * 
	 * (Shuffle ArrayList) Write the following method that shuffles the elements in
	 * an ArrayList of integers.
	 * public static void shuffle(ArrayList<Integer> list)
	 */
	
	/** Method for shuffle ArrayList of integers */
	public static void shuffle(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			/** Use shuffle() method from Collections class to shuffle list */
			Collections.shuffle(list);
			/** Display shuffled integers */
			System.out.print(list.get(i) + " ");
		}
	}

////////////////////////////////////////////////////////
	                /** Main */
////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		/** Initialize an array with integers */
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		/** Assign array integers into ArrayList using asList() method */
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); 
		
		/** Invoke method */
		shuffle(list);
		
	}

}
