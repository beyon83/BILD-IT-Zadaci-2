package zadaci_13_08_2015;

public class MyRectangle2D {
	
	/**
	 * Zadatak: 3
	 * 
	 *  (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
	 *  contains:
	 *  ■ Two double data fields named x and y that specify the center of the rectangle
	 *  with getter and setter methods. (Assume that the rectangle sides are
	 *  parallel to x- or y- axes.)
	 *  ■ The data fields width and height with getter and setter methods.
	 *  ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
	 *  1 for both width and height.
	 *  ■ A constructor that creates a rectangle with the specified x, y, width, and
	 *  height.
	 *  ■ A method getArea() that returns the area of the rectangle.
	 *  ■ A method getPerimeter() that returns the perimeter of the rectangle.
	 *  ■ A method contains(double x, double y) that returns true if the
	 *  specified point (x, y) is inside this rectangle (see Figure 10.24a).
	 *  ■ A method contains(MyRectangle2D r) that returns true if the specified
	 *  rectangle is inside this rectangle (see Figure 10.24b).
	 *  ■ A method overlaps(MyRectangle2D r) that returns true if the specified
	 *  rectangle overlaps with this rectangle (see Figure 10.24c).
	 *  
	 *  Draw the UML diagram for the class and then implement the class. Write a test
	 *  program that creates a MyRectangle2D object r1 (new MyRectangle2D(2,
	 *  2, 5.5, 4.9)), displays its area and perimeter, and displays the result of
	 *  r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5,
	 *  3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
	 */
	
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	/** Getters */
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	/** Returns the area of the rectangle */
	public double getArea() {
		return width * height;
	}
	
	/** Returns the perimeter of the rectangle */
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	/** returns true if the
	 *  specified point (x, y) is inside this rectangle */
	public boolean contains(double x, double y) {
		return Math.abs(2 * (x - this.x) - height) < height && Math.abs(2 * (y - this.y) - width) < width;
	}
	
	/** returns true if the specified
	 *  rectangle is inside this rectangle */
	public boolean contains(MyRectangle2D r) {
		return Math.abs(2 * (r.getX() - this.x) - height) < height && Math.abs(2 * (r.getY() - this.y) - width) < width;
	}
	
	/** returns true if the specified
	 *  rectangle overlaps with this rectangle */
	public boolean overlaps(MyRectangle2D r) {
		return x < r.x + r.width && x + width > r.x && y < r.y + r.height && y + height > r.y;
	}
	
///////////////////////////////////////////////////////////////////
	                     /** Main */
///////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Create rectangle object */
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		/** Display area of the rectangle */
		System.out.printf("Display area of the rectangle: %.2f \n", + r1.getArea());
		/** Display perimeter of the rectangle */
		System.out.printf("Display perimeter of the rectangle %.2f \n", + r1.getPerimeter());
		/** Return true or false if point is inside of the rectangle */
		System.out.println("Is point inside of the rectangle? " + r1.contains(3, 3));
		/** Return true or false if rectangle is inside of another rectangle */
		System.out.println("Is rectangle inside of another rectangle? " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		/** Return true or false if rectangle overlaps another rectangle */
		System.out.println("Does rectangle overlaps another rectangle? " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
		
	}

}
