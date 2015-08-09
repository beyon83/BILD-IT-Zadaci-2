package zadaci_08_08_2015;

import java.util.Scanner;

public class MultiplyTwoMatrices {
	
	/**
	 * Zadatak: 2.
	 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
	 * header of the method is:
	 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
	 * To multiply matrix a by matrix b, the number of columns in a must be the same as
	 * the number of rows in b, and the two matrices must have elements of the same or
	 * compatible types. Let c be the result of the multiplication. Assume the column size
	 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
	 * For example, for two 3 * 3 matrices a and b, c is
	 * £
	 * a11 a12 a13
	 * a21 a22 a23
	 * a31 a32 a33
	 * ≥ * £
	 * b11 b12 b13
	 * b21 b22 b23
	 * b31 b32 b33
	 * ≥ = £
	 * c11 c12 c13
	 * c21 c22 c23
	 * c31 c32 c33
	 * ≥
	 * where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
	 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays
	 * their product. Here is a sample run:
	 * 
	 * Enter matrix1: 1 2 3 4 5 6 7 8 9
	 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
	 * The multiplication of the matrices is
	 * 1 2 3       0  2.0  4.0        5.3 23.9 24
	 * 4 5 6  *    1  4.5  2.2   =   11.6 56.3 58.2
	 * 7 8 9      1.1 4.3  5.2       17.9 88.7 92.4
	 */

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		/** Create third matrix (c) for storing result of the multiplication a * b */
		double[][] c = new double[a.length][a[0].length];
		
		/** Go through 3 for loops to get final result */
		for(int row = 0; row < a.length; row++) {
			for(int column = 0; column < a[row].length; column++) {
				for(int k = 0; k < 3; k++) {
					c[row][column] += a[row][k] * b[k][column]; 
				}
			}
		}
		return c; // return c matrix
	}
	
////////////////////////////////////////////////////////////////////////
	                      /** Main */
////////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		
		double[][] c = new double[3][3];
		
		System.out.println("Enter first matrix: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Enter second matrix: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		/** Invoke the method */
		c = multiplyMatrix(matrix1, matrix2);
		
		/** Display numbers of the first matrix */
		System.out.println("(Matrix a: )");
		for(int row = 0; row < matrix1.length; row++) {
			for(int column = 0; column < matrix1[row].length; column++) {
				System.out.printf("%.1f ", matrix1[row][column]);
			}
			System.out.println();
		}
		
		System.out.println(" * ");
		
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
		
		/** Display result of multiplication the first two matrices */
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
