package zadaci_25_08_2015;

public class Square extends GeometricObject implements Colorable {
	
	double side;
	
	/** Constructor with specified side */
	public Square(double side) {
		this.side = side;
	}
	
	/** Implement method howToColor() from Colorable interface */
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	/** Override getArea() method and return area of the square */
	@Override
	public double getArea() {
		return side * side;
	}

	/** Override getPerimeter() method and return it */
	@Override
	public double getPerimeter() {
		return 4 * side;
	}

}
