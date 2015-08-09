package zadaci_08_08_2015;

// import java.util.Scanner;

public class EvenNumberOfOnes {
	
	/**
	 * Zadatak: 5.
	 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
	 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
	 * every column have an even number of 1s.
	 */
	
	public static boolean isEven(int[][] matrix) {
		
		for(int i = 0; i < 6; i++) {
			int tempRows = 0; 
			int tempColumns = 0;
			for(int j = 0; j < 6; j++) {
				tempRows += matrix[i][j]; // sum the rows
				tempColumns += matrix[j][i]; // sum the columns
				try {
					if(tempRows % tempColumns != 0) { // if tempRows is divisible by tempColumns without remainder
						return false; // return false
					}
				} catch(ArithmeticException e) {
					/** If exception "not divisible by zero" has occurred, continue with the second for loop */
					continue; 
				} 
			}
		}
		return true;
	}
	
///////////////////////////////////////////////////////
	               /** Main */
///////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
	//	Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[6][6];
		
		/** Assign randomly 0's and 1's into matrix */
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			//	matrix[i][j] = input.nextInt();
			}
		}
		
		/** Display matrix */
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		/** Display result */
		boolean b = isEven(matrix);
		System.out.println(b);
		
	}
}
