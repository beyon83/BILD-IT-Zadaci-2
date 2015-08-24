package zadaci_24_08_2015;

import java.util.ArrayList;

public class SortArrayList {
	
	/**
	 * Zadatak: 5
	 * 
	 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
	 * public static void sort(ArrayList<Number> list)
	 */
	
	public static void sort(ArrayList<Number> list) {
		/** sorting an ArrayList using the "bubble sort" algorithm */
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if((Integer) list.get(j) <  (Integer) list.get(i)) {
					Integer temp = (Integer) list.get(i);
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
		
		/** Create ArrayList of numbers */
		ArrayList<Number> list = new ArrayList<>();
		/** Add numbers to the list
		 * note: numbers 5, 2, 7, etc. will be automatically added as "new Integer(5)"
		 * "new Integer(2), etc. */
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(3);
		list.add(1);
		list.add(6);
		
		
		/** Invoke method */
		sort(list);
		
		/** Display ArrayList */
		for(Number l: list) {
			System.out.print(l + " ");
		}
		
	}

}
