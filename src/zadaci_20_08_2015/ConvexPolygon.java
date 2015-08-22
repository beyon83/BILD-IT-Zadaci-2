package zadaci_20_08_2015;

import java.util.Scanner;

public class ConvexPolygon {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Area of a convex polygon) A polygon is convex if it contains any line segments
	 * that connects two points of the polygon. Write a program that prompts the user to
	 * enter the number of points in a convex polygon, then enter the points clockwise,
	 * and display the area of the polygon. Here is a sample run of the program:
	 * 
	 * Enter the number of the points: 7
	 * Enter the coordinates of the points:
	 * -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
	 * The total area is 250.075
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of points: ");
		
		int points = input.nextInt();
		
		/** Create array of double numbers that represents coordinates of the points */
		double[][] xy = new double[points][2];
		
		/** Prompt the user to enter points */
		System.out.print("Enter points: ");
		for(int i = 0; i < xy.length; i++) {
			for(int j = 0; j < xy[i].length; j++) {
				xy[i][j] = input.nextDouble();
			}
		}
		
		double sum = 0;
		
		/** Get sum of the area using following formula: */
		for(int i = 0; i < xy.length-1; i++) {
			sum += (xy[i][0] * xy[i+1][1]) - (xy[i][1] * xy[i+1][0]);
		}
		
		/** Get sum of the first and last indices */
		sum += (xy[6][0] * xy[0][1]) - (xy[6][1] * xy[0][0]);
		
		/** Compute area using Math.abs() method */
		double area = Math.abs(sum / 2);
		
		System.out.println("Area of the polygon is: " + area);
		
		input.close();
		
	}

}
