package zadaci_07_08_2015;

import java.util.Scanner;

public class SumColumnsOfMultidimensionalArray {
	
	/**
	 * Zadatak: 4.
	 * (Sum elements column by column) Write a method that returns the sum of all the
	 * elements in a specified column in a matrix using the following header:
	 * 
	 * public static double sumColumn(double[][] m, int columnIndex)
	 * 
	 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
	 * column. Here is a sample run:
	 * Enter a 3-by-4 matrix row by row:
	 * 
	 * 1.5  2  3  4
	 * 5.5  6  7  8
	 * 9.5  1  3  1
	 * 
	 * Sum of the elements at column 0 is 16.5
	 * Sum of the elements at column 1 is 9.0
	 * Sum of the elements at column 2 is 13.0
	 * Sum of the elements at column 3 is 13.0
	 */
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0; // set sum of columns
		for(int i = 0; i < m.length; i++) {
			sum = sum + m[i][columnIndex]; // sum columns by passing the argument columnIndex
		}
		return sum; // return sum
	}
	
///////////////////////////////////////////////////////////
	                 /** Main */
///////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		
		/** Create an 3 by 4 matrix */
		double[][] matrix = new double[3][4];
		
		/** Enter values into matrix */
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		/** Display the matrix */
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		/** Display sum od columns */
		for(int columnIndex = 0; columnIndex < 4; columnIndex++) {
			System.out.println("Sum of the elements at column " + columnIndex + " is: " + sumColumn(matrix, columnIndex));
		}
		
		input.close();
	}

}