package zadaci_25_08_2015;

public class CircleObject extends GeometricObject implements Colorable {
	
	double radius; // radius
	private static int numberOfObjects; 
	
	/** Create Circle constructor with radius */
	public CircleObject(double newRadius) {
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

	/** Override getPerimeter() method */
	@Override
	public double getPerimeter() {
		return 0;
	}

	/** Override howToColor() method from Colorable interface */
	@Override
	public void howToColor() {
		System.out.println("Color the circle");
	}

}

