package zadaci_07_08_2015;

import java.util.Scanner;

public class AddTwoMatrices {
	
	/**
	 * Zadatak: 5.
	 * (Algebra: add two matrices) Write a method to add two matrices. The header of
	 * the method is as follows:
	 * 
	 * public static double[][] addMatrix(double[][] a, double[][] b)
	 * 
	 * In order to be added, the two matrices must have the same dimensions and the
	 * same or compatible types of elements. Let c be the resulting matrix. Each element
	 * cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
	 * £
	 * a11 a12 a13
	 * a21 a22 a23
	 * a31 a32 a33
	 * ≥ + £
	 * b11 b12 b13
	 * b21 b22 b23
	 * b31 b32 b33
	 * ≥ = £
	 * a11 + b11 a12 + b12 a13 + b13
	 * a21 + b21 a22 + b22 a23 + b23
	 * a31 + b31 a32 + b32 a33 + b33
	 * ≥
	 * Write a test program that prompts the user to enter two 3 * 3 matrices and\
	 * displays their sum. Here is a sample run:
	 * 
	 * Enter matrix1: 1 2 3 4 5 6 7 8 9
	 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
	 * The matrices are added as follows
	 * 1.0 2.0 3.0 0.0 2.0 4.0 1.0 4.0 7.0
	 * 4.0 5.0 6.0 + 1.0 4.5 2.2 = 5.0 9.5 8.2
	 * 7.0 8.0 9.0 1.1 4.3 5.2 8.1 12.3 14.2
	 */

	public static double[][] addMatrix(double[][] a, double[][] b) {
		/** Create third matrix for storing result of the sum a + b */
		double[][] c = new double[a.length][a[0].length];
		
		for(int row = 0; row < a.length; row++) {
			for(int column = 0; column < a[row].length; column++) {
				a[row][column] = (double)(Math.random() * 20); // Assign random values to the first matrix
				b[row][column] = (double)(Math.random() * 20); // Assing rand. values to the second matrix
				c[row][column] = a[row][column] + b[row][column]; // Add a + b and assign it to the third matrix
			}
		}
		return c; // return c matrix
	}
	
////////////////////////////////////////////////////////////////////////
	                      /** Main */
////////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt the user to enter two matrices */
		System.out.println("Unesite broj redova i broj kolona: ");
		int brojRedova = input.nextInt();
		int brojKolona = input.nextInt();
		
		double[][] matrix1 = new double[brojRedova][brojKolona];
		double[][] matrix2 = new double[brojRedova][brojKolona];
		
		double[][] c = new double[matrix1.length][matrix1[0].length];
		
		/** Invoke the method */
		c = addMatrix(matrix1, matrix2);
		
		/** Display numbers of the first matrix */
		System.out.println("(Matrix a: )");
		for(int row = 0; row < matrix1.length; row++) {
			for(int column = 0; column < matrix1[row].length; column++) {
				System.out.printf("%.1f ", matrix1[row][column]);
			}
			System.out.println();
		}
		
		System.out.println(" + ");
		
		/** Display numbers of the second matrix */
		System.out.println("(Matrix b: )");
		for(int row = 0; row < matrix2.length; row++) {
			for(int column = 0; column < matrix2[row].length; column++) {
				System.out.printf("%.1f ", matrix2[row][column]);
			}
			System.out.println();
		}
			
		System.out.println(" = ");
		
		String space = " ";
		
		/** Display result of the first two matrices */
		System.out.println("(Matrix c(result): )");
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				System.out.printf("%.1f %s", c[i][j], space);
			}
			System.out.println();
		}
		
		input.close();
	}
}