package zadaci_25_08_2015;

public class RectangleObject extends GeometricObject implements Colorable {

	private double width;
	private double height;
	
	/** Constructor with specified width and height */
	public RectangleObject(double width, double height) {
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
 
	/** Override howToColor() method from Colorable interface */
	@Override
	public void howToColor() {
		System.out.println("Color all sides of the rectangle.");
	}
	
}
