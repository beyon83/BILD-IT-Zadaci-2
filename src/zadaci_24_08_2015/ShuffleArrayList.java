package zadaci_24_08_2015;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of
	 * numbers:
	 * public static void shuffle(ArrayList<Number> list)
	 */
	
	/** Shuffle list using shuffle() method from Collections class */
	public static void shuffle(ArrayList<Number> list) {
		Collections.shuffle(list);
	}

	public static void main(String[] args) {
		
		/** Create ArrayList of numbers, and add some numbers to it */
		ArrayList<Number> list = new ArrayList<>();
		/** Add numbers to the list
		 * note: numbers 1, 2, 3, etc. will be automatically added as "new Integer(1)"
		 * "new Integer(2), etc. */
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		/** Call shuffle method */
		shuffle(list);
		
		/** Display ArrayList */
		for(Number l: list) {
			System.out.print(l + " ");
		}
		
	}

}
