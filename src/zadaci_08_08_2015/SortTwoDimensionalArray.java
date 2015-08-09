package zadaci_08_08_2015;

public class SortTwoDimensionalArray {
	
	/**
	 * Zadatak: 4.
	 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
	 * using the following header:
	 * public static void sort(int m[][])
	 * The method performs a primary sort on rows and a secondary sort on columns.
	 * For example, the following array
	 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
	 * will be sorted to
	 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}. 
	 */
	
	public static void sort(int m[][]) {
		
		/** Sort matrix using bubble sort approach */
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m.length-1; j++) {
				/** Sort by rows */
				if(m[j][0] > m[j+1][0]) {
					int temp1 = m[j][0];
					int temp2 = m[j][1];
					m[j][0] = m[j+1][0];
					m[j][1]= m[j+1][1];
					m[j+1][0] = temp1;
				    m[j+1][1] = temp2;
				}
				/** Sort by columns */
				if(m[j][0] == m[j+1][0]) {
					if(m[j][1] >m[j+1][1]) {
						int temp3 = m[j][1];
				        m[j][1] = m[j+1][1];
				        m[j+1][1] = temp3;
					}
				}
			}
		}
		
		/** Display sorted matrix */
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
/////////////////////////////////////////////////////////////
	                    /** Main */
/////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Initialize matrix with numbers */
		int[][] matrix = { {4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1} };
		
		/** Sort matrix method */
		sort(matrix);
		
	}

}
