package zadaci_08_08_2015;

import java.util.Arrays;

public class EmployeeHours {
	
	/**
	 * Zadatak: 1.
	 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
	 * employees are stored in a two-dimensional array. Each row records an employee’s
	 * seven-day work hours with seven columns. For example, the following
	 * array stores the work hours for eight employees. Write a program that displays
	 * employees and their total hours in decreasing order of the total hours.
	 * 
	 *             Su M  T  W  Th F  Sa
	 * Employee 0  2  4  3  4  5  8  8
	 * Employee 1  7  3  4  3  3  4  4
	 * Employee 2  3  3  4  3  3  2  2
	 * Employee 3  9  3  4  7  3  4  1
	 * Employee 4  3  5  4  3  6  3  8
	 * Employee 5  3  4  4  6  3  4  4
	 * Employee 6  3  7  4  8  3  8  4
	 * Employee 7  6  3  5  9  2  7  9
	 * 
	 * Program should output:
	 * employee 7: 41
	 * employee 6: 37
	 * employee 0: 34
	 * employee 4: 32
	 * employee 3: 31
	 * employee 1: 28
	 * employee 5: 28
	 * employee 2: 20
	 */

	public static void main(String[] args) {
		
		/** Initialize an 2D array of employee's hours */
		int[][] hours = {{2, 4, 3, 4, 5, 8, 8}, 
				         {7, 3, 4, 3, 3, 4, 4},
				         {3, 3, 4, 3, 3, 2, 2}, 
				         {9, 3, 4, 7, 3, 4, 1}, 
				         {3, 5, 4, 3, 6, 3, 8}, 
				         {3, 4, 4, 6, 3, 4, 4},
				         {3, 7, 4, 8, 3, 8, 4}, 
				         {6, 3, 5, 9, 2, 7, 9}};
		
		/** Sum of hours */
		int[] total = new int[8];

		/** Sum hours by rows */
		for(int i = 0; i < hours.length; i++) {
			for(int j = 0; j < hours[i].length; j++) {
				total[i] += hours[i][j];
			}
		}
		
		/** Sort hours in increasing order */
		Arrays.sort(total);
		
		/** Reverse sorted array */
		for(int i = hours.length-1; i >= 0; i--) {
			System.out.println("Employee " + i + " = " + total[i]);
		}
		
	}
}
