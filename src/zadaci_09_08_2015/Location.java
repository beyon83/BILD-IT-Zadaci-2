package zadaci_09_08_2015;

import java.util.Scanner;

public class Location {
	
	/**
	 * (The Location class) Design a class named Location for locating a maximal
	 * value and its location in a two-dimensional array. The class contains public data
	 * fields row, column, and maxValue that store the maximal value and its indices
	 * in a two-dimensional array with row and column as int types and maxValue as
	 * a double type.
	 * Write the following method that returns the location of the largest element in a
	 * two-dimensional array:
	 * public static Location locateLargest(double[][] a)
	 * The return value is an instance of Location. Write a test program that prompts
	 * the user to enter a two-dimensional array and displays the location of the largest
	 * element in the array.
	 */
	
	public int indexI;
	public int indexJ;
	public int maxValue;
	
	public static Location locateLargest(int[][] matrix) {
		
		/** Create an instance of the location */
		Location location = new Location();
		location.maxValue = matrix[0][0]; // Declare maxValue with positions at first indices in an matrix
		location.indexI = 0; // Assign 0 to index i
		location.indexJ = 0; // Assign 0 to index j
		
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				/** Find the largest element */
				if(location.maxValue < matrix[row][column]) {
					/** Assign largest element to the maxValue */
					location.maxValue = matrix[row][column]; // Greatest number
					location.indexI = row; // Assign new number of the row to the index i
					location.indexJ = column; // Assign new number of the column to the index j
				}
			}
		}
		return location; // return location
	}
	
//////////////////////////////////////////////////////////////////////
	                   /** Main */
//////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona: ");
		int brojRedova = input.nextInt();
		int brojKolona = input.nextInt();
		
		/** Create 2D matrix */
		int[][] matrix = new int[brojRedova][brojKolona];
		
		/** Prompt the user to enter numbers into 2D array */
		System.out.println("Unesite " + brojRedova + " redova i " + brojKolona + " kolona:");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		
		/** Display matrix */
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		
		/** Invoke method and display result */
		Location location = locateLargest(matrix);
		System.out.println("Largest number is: " + location.maxValue + ". \nLocation of the number: " + location.indexI + ", " + location.indexJ);
		
		input.close();
	}
}
