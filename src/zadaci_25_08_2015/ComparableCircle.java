package zadaci_25_08_2015;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	
	/**
	 * (The ComparableCircle class) Define a class named ComparableCircle
	 * that extends Circle and implements Comparable. Draw the UML diagram and
	 * implement the compareTo method to compare the circles on the basis of area.
	 * Write a test class to find the larger of two instances of ComparableCircle objects.
	 */
	
	/** Inherit superclass's constructor */
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	/** Implement method to compare two objects */
	public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2) {
		if (c1.compareTo(c2) > 0 ) {
			return c1;
		} else {
			return c2;
		}
	}
	
	/** Implement Comparable interface */
	public interface Comparable {
		public int compareTo(ComparableCircle c);
	}
	
	/** override compareTo() method and obtain result  */
	@Override
	public int compareTo(ComparableCircle c) {
		if (this.getArea() > c.getArea()) {
			return 1;
		} else if (this.getArea() < c.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
