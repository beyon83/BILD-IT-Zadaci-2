package zadaci_09_08_2015;

import java.util.Arrays;
import java.util.Scanner;

public class StrictlyIdenticalArrays {
	
	/**
	 * Zadatak: 2.
	 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
	 * identical if their corresponding elements are equal. Write a method that returns
	 * true if m1 and m2 are strictly identical, using the following header:
	 * public static boolean equals(int[][] m1, int[][] m2)
	 * Write a test program that prompts the user to enter two 3 * 3 arrays of
	 * integers and displays whether the two are strictly identical. Here are the
	 * sample runs.
	 * 
	 * Enter list1: 51 22 25 6 1 4 24 54 6
	 * Enter list2: 51 22 25 6 1 4 24 54 6
	 * The two arrays are strictly identical
	 * 
	 * Enter list1: 51 25 22 6 1 4 24 54 6
	 * Enter list2: 51 22 25 6 1 4 24 54 6
	 * The two arrays are not strictly identical
	 */

	public static boolean equals(int[][] m1, int[][] m2) {
		for(int i = 0; i < 3; i++) {
			for(int j = i; j < 3; j++) {
				/** Use deepEquals() method to check if two matrices are strictly equal to each other */
				if(Arrays.deepEquals(m1, m2)) {
					return true;
				} 
			}
		}
		return false;
	}
	
////////////////////////////////////////////////////////
	                 /** Main */
////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create two 3-by-3 matrices */
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		
		/** Insert first matrix */
		System.out.println("Enter list1: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextInt();
			}
		}
		
		/** Insert second matrix */
		System.out.println("Enter list2: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextInt();
			}
		}
		
		/** Invoke method */
		boolean b = equals(matrix1, matrix2);
		
		/** Display result using boolean expression */
		if(b == true) {
			System.out.println("The two arrays are strictly identical.");
		} else {
			System.out.println("The two arrays are not strictly identical.");
		}
		
		input.close();
	}

}
