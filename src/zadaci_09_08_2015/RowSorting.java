package zadaci_09_08_2015;

import java.util.Arrays;
import java.util.Scanner;

public class RowSorting {
	
	/**
	 * Zadatak: 1.
	 * (Row sorting) Implement the following method to sort the rows in a twodimensional
	 * array. A new array is returned and the original array is intact.
	 * public static double[][] sortRows(double[][] m)
	 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
	 * values and displays a new row-sorted matrix. 
	 * Here is a sample run:
	 * 
	 * Enter a 3-by-3 matrix row by row:
	 * 
	 * 0.15 0.875 0.375
	 * 0.55 0.005 0.225
	 * 0.30 0.12 0.4
	 * 
	 * The row-sorted array is:
	 * 
	 * 0.15 0.375 0.875
	 * 0.005 0.225 0.55
	 * 0.12 0.30 0.4
	*/
	
	public static double[][] sortRows(double[][] m) {
		/** Sort rows using sort() method */
		for(int i = 0; i < m.length; i++) {
			Arrays.sort(m[i]);
		}
		return m;
	}
	
/////////////////////////////////////////////////////////
	                /** Main */
/////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3-by-3 matrix: ");
		
		/** Create an 3-by-3 matrix */
		double[][] matrix = new double[3][3];
		
		/** Prompt the user to insert numbers into matrix */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		/** Invoke method and display result */
		double[][] m = sortRows(matrix);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
