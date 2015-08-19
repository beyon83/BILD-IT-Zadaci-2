package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {
	
	/**
	 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
	 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
	 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with
	 * the most 1s.) Here is a sample run of the program:
	 * 
	 * Enter the array size n: 4 ->ENTER
	 * The random array is
	 * 0 0 1 1
	 * 0 0 1 1
	 * 1 1 0 1
	 * 1 0 1 0
	 * The largest row index: 2
	 * The largest column index: 2, 3
	 */
	
/////////////////////////////////////////////////////////////	
	
	/** Display matrix method */
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
/////////////////////////////////////////////////////////////	
	
	public static void storeRowsAndColumns(int[][] matrix, ArrayList<Integer> rows, ArrayList<Integer> columns) {
		
		int maxRow = -1; // Declare maxRow initially to -1
		
		for(int i = 0; i < matrix.length; i++) {
			int temp = 0; // create temp variable
			for(int j = 0; j < matrix[i].length; j++) {
				temp = temp + matrix[i][j]; // sum rows to the temp variable
				if(temp > maxRow) { // if temp is greater than maxRow
					maxRow = temp;  // assign value of temp to the maxRow
					rows.clear();   // clear ArrayList to retain only one greatest element in the list
					rows.add(i);    // add greatest row to the list
				}
			}
		}
		
		/** Do the same for the column */
		int maxColumn = -1;
		
		for(int i = 0; i < matrix.length; i++) {
			int temp = 0;
			for(int j = 0; j < matrix[i].length; j++) {
				temp += matrix[j][i];
				if(temp > maxColumn) {
					maxColumn = temp;
					columns.clear();
					columns.add(i);
				}
			}
		}
	}
	
////////////////////////////////////////////////////////	
	                /** Main */
////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create to lists to store row and column */
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();
		
		/** Prompt the user to enter n x n matrix */
		System.out.println("Unesite n x n matrix: ");
		int nxn = input.nextInt();
		
		int[][] matrix = new int[nxn][nxn];
		
		/** Assign random numbers (0, 1) to the matrix */
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		
		/** Invoke methods */
		printMatrix(matrix);
		storeRowsAndColumns(matrix, rows, columns);
		
		System.out.println();
		
		/** Display results */
		for(Integer r: rows) {
			System.out.println("Max row: " + r);
		}
		
		for(Integer c: columns) {
			System.out.println("Max column: " + c);
		}

		input.close();
	}

}
