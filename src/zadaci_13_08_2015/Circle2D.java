package zadaci_13_08_2015;

public class Circle2D {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Geometry: the Circle2D class) Define the Circle2D class that contains:
	 * ■ Two double data fields named x and y that specify the center of the circle
	 * with getter methods.
	 * ■ A data field radius with a getter method.
	 * ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
	 * for radius.
	 * ■ A constructor that creates a circle with the specified x, y, and radius.
	 * ■ A method getArea() that returns the area of the circle.
	 * ■ A method getPerimeter() that returns the perimeter of the circle.
	 * ■ A method contains(double x, double y) that returns true if the
	 * specified point (x, y) is inside this circle (see Figure 10.21a).
	 * ■ A method contains(Circle2D circle) that returns true if the specified
	 * circle is inside this circle (see Figure 10.21b).
	 * ■ A method overlaps(Circle2D circle) that returns true if the specified
	 * circle overlaps with this circle (see Figure 10.21c).
	 * 
	 * Draw the UML diagram for the class and then implement the class. Write a test
	 * program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
	 * displays its area and perimeter, and displays the result of c1.contains(3,
	 * 3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
	 * Circle2D(3, 5, 2.3)).
	 */
	
	private double x;
	private double y;
	private double radius;
	
	/** A no-arg constructor that creates a default circle with 
	 * (0, 0) for (x, y) and 1 for radius */
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	/** A constructor that creates a circle with the specified x, y, and radius */
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/** Getters */
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	/** Returns the area of the circle */
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/** Returns the perimeter of the circle */
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	/** Returns true if the specified point (x, y) is inside this circle */
	public boolean contains(double x, double y) {
		/** Calculate distance from this x, y to x, y */
		double distance = Math.sqrt((this.x - x) * (this.x - x) - (this.y - y) * (this.y - y));
		if(distance > getRadius()) {
			return false;
		}
		return true; 
	}
	
	/** returns true if the specified circle is inside this circle */
	public boolean contains(Circle2D circle) {
		
        double x2 = circle.getX(); // get coordinate of the circle's x
        double y2 = circle.getY(); // get coordinate of the circle's y
		double distance = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));   // determine the distance from this x,y to c's x,y
		if(distance <= radius - circle.getRadius()) {  // if distance lower than radius 
			return true; // then return true
		} else {
			return false;
		}
        
	}
	
	/** returns true if the specified circle overlaps with this circle */
	public boolean overlaps(Circle2D circle) {
		double x2 = circle.getX();
		double y2 = circle.getY();
		double distance = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y-y2));
		/** Returns true if distance from this x and y and circle's x and y is lower than radius + circle's radius */
		if(distance <= radius + circle.getRadius()) {
			return true; 
		} else {
			return false; 
		}
	}
	
/////////////////////////////////////////////////////////////////
	                   /** Main */
/////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Create circle object */
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.printf("Perimeter of the circle: %.2f \n", + c1.getPerimeter()); // display perimeter
		System.out.printf("Area of the circle: %.2f \n", + c1.getArea()); // display area
		/** Display true or false if point is inside of the circle */
		System.out.println("Specified point is inside the circle? " + c1.contains(3, 3));
		/** Display true or false if circle is inside of another circle */
		System.out.println("Circle is inside of another circle? " + c1.contains(new Circle2D(3, 5, 10.5)));
		/** Display true or false if circle overlaps over another circle */
		System.out.println("Circle overlaps over another circle? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
		
	}

}
