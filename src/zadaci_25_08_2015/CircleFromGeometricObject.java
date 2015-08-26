package zadaci_25_08_2015;

public class CircleFromGeometricObject extends GeometricObject {

	private double radius; // radius data field
	
	/** Empty constructor */
	public CircleFromGeometricObject() {
		
	}
	
	/** Constructor with radius */
	public CircleFromGeometricObject(double radius) {
		this.radius = radius;
	}
	
	/** Return area of the circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
}
