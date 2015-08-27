package zadaci_26_08_2015;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	/**
	 * Zadatak: 3
	 * 
	 * (The Octagon class) Write a class named Octagon that extends
	 * GeometricObject and implements the Comparable and Cloneable interfaces.
	 * Assume that all eight sides of the octagon are of equal length. The area can
	 * be computed using the following formula:
	 * area = (2 + 4/V22)* side * side
	 * Draw the UML diagram that involves Octagon, GeometricObject,
	 * Comparable, and Cloneable. Write a test program that creates an Octagon
	 * object with side value 5 and displays its area and perimeter. Create a new object
	 * using the clone method and compare the two objects using the compareTo
	 * method.
	 */

	private double side;
	
	/** Empty constructor */
	public Octagon() {
		
	}
	
	/** Constructor with specified sides */
	public Octagon(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}

	/** Override getArea() method and implement it using the following formula */
	@Override
	public double getArea() {
		return (2 + (4 / (Math.sqrt(2))) * side * side);
	}

	/** Override getPerimeter() method and implement it */
	@Override
	public double getPerimeter() {
		return side * 8;
	}

	/** Override and implement compareTo() method that compares two objects */
	@Override
	public int compareTo(Octagon object) {
		if(this.getArea() > object.getArea()) {
			return 1;
		} else if(this.getArea() < object.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	/** Override toString() method to display area and perimeter of the octagon */
	@Override
	public String toString() {
		return "Area of the octagon is: " + getArea() + "\nPerimeter of the octagon is: " + getPerimeter();
	}
	
	/** Override clone() method to return new cloned object */
	@Override 
	public Octagon clone() {
		return new Octagon(this.side);
	}
	
}
