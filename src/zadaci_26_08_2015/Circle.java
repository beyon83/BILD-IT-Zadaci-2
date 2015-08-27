package zadaci_26_08_2015;

public class Circle extends GeometricObject implements Comparable<Circle> {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
	 * GeometricObject and implement the Comparable interface. Override the
	 * equals method in the Object class. Two Circle objects are equal if their radii
	 * are the same. Draw the UML diagram that involves Circle, GeometricObject,
	 * and Comparable.
	 */
	
	double radius; // radius
	private static int numberOfObjects; 
	
	/** Create Circle constructor with radius */
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set radius */
	public void setRadius(double newRadius) {
		if(radius >= 0) {
			radius = newRadius;
		}
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** Return area of the circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Override getPerimeter() method from GeometricObject class, and implement it */
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Override and implement compareTo() method that compares two objects */
	@Override
	public int compareTo(Circle object) {
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
        if(object instanceof Circle) {
        	double obj = ((Circle) object).radius;
            if(obj == this.radius) {
                return true;
            } 
        }
		return false;
	}

}

