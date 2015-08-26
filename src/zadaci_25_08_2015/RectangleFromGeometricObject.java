package zadaci_25_08_2015;

public class RectangleFromGeometricObject extends GeometricObject {

	private double width;
	private double height;
	
	/** Constructor with specified width and height */
	public RectangleFromGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/** Return area of the rectangle */
	@Override
	public double getArea() {
		return width * height;
	}
	
	/** Return perimeter of the rectangle */
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
}
