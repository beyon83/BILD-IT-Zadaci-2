package zadaci_25_08_2015;

public class Circle {
	
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
	double getArea() {
		return radius * radius * Math.PI;
	}

}

