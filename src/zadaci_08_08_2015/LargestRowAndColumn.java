package zadaci_08_08_2015;

public class LargestRowAndColumn {
	
	/**
	 * Zadatak: 3.
	 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
	 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
	 * most 1s. Here is a sample run of the program:
	 * 0 0 1 1
	 * 0 0 1 1
	 * 1 1 0 1
	 * 1 0 1 0
	 * The largest row index: 2
	 * The largest column index: 2
	 */

	public static void main(String[] args) {
		
		/** Create a 4 by 4 matrix */
		int[][] matrix = new int[4][4];
		
		/** Fill in matrix with 0's and 1's randomly */
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		
		/** Display matrix */
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int row = 0;
		int largestRow = -1;
		
		/** Get largest row */
		for(int i = 0; i < 4; i++) {
			int temp = 0; 
			for(int j = 0; j < 4; j++) {
				temp += matrix[i][j]; // sum rows and add it to the temp variable
				if(temp > largestRow) { // if temp is greater than largestRow(-1)
					largestRow = temp; // assign temp value to the largestRow
					row = i; // assign i value to the row variable
				}
			}
		}
		
		int column = 0;
		int largestColumn = -1;
		
		/** Get largest column */
		for(int i = 0; i < 4; i++) {
			int temp = 0;
			for(int j = 0; j < 4; j++) {
				temp += matrix[j][i]; // sum columns and add it to the temp variable
				if(temp > largestColumn) { // if temp is greater than largestColumn(-1)
					largestColumn = temp; // assign temp value to the largestColumn
					column = i; // assign i value to the column variable
				}
			}
		}
		
		/** Display result */
		System.out.println("The largest row index: " + row);
		System.out.println("The largest column index: " + column);
		
	}
}
