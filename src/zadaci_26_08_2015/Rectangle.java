package zadaci_26_08_2015;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	
	/**
	 * Zadatak: 2
	 * 
	 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
	 * extend GeometricObject and implement the Comparable interface. Override
	 * the equals method in the Object class. Two Rectangle objects are equal
	 * if their areas are the same. Draw the UML diagram that involves Rectangle,
	 * GeometricObject, and Comparable.
	 */

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	/** Override and implement compareTo() method that compares two objects */
	@Override
	public int compareTo(Rectangle object) {
		if(this.getArea() > object.getArea()) {
			return 1;
		} else if(this.getArea() < object.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	/** Override equals() method from the Object class and do implementation */
	@Override
	public boolean equals(Object object) {
		/** If object is instance of Circle class, do following */
        if(object instanceof Rectangle) {
        	double obj = ((Rectangle) object).getArea();
            if(obj == this.getArea()) {
                return true;
            } 
        }
		return false;
	}

}
