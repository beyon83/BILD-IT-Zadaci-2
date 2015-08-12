package zadaci_12_08_2015;

public class MyPoint {
	
	/**
	 * Zadatak: 3
	 * 
	 * (The MyPoint class) Design a class named MyPoint to represent a point with
	 * x- and y-coordinates. The class contains:
	 * ■ The data fields x and y that represent the coordinates with getter methods.
	 * ■ A no-arg constructor that creates a point (0, 0).
	 * ■ A constructor that constructs a point with specified coordinates.
	 * ■ A method named distance that returns the distance from this point to a
	 *   specified point of the MyPoint type.
	 * ■ A method named distance that returns the distance from this point to
	 * another point with specified x- and y-coordinates.
	 * Draw the UML diagram for the class and then implement the class. Write a
	 * test program that creates the two points (0, 0) and (10, 30.5) and displays the
	 * distance between them.
	 */
	
	private double x;
	private double y;
	
	/** No-args constructor with x and y set to 0 */
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	/** Constructor with specified coordinates */
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/** Getters - returning x and y methods */
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	/** Formula for getting the distance between two points */
	public static double distance(MyPoint p1, MyPoint p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
	
	
/////////////////////////////////////////////////////////////
	                    /** Main */
/////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Constructor for the first point */
		MyPoint p1 = new MyPoint(0, 0);
		
		/** Constructor for the second point */
		MyPoint p2 = new MyPoint(10, 30.5);
		
		/** Print result */
		System.out.println("Result: " + distance(p1, p2));
		
	}
}
