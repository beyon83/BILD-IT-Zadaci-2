package zadaci_25_08_2015;

public class GeometricObjectComparableMain {
	
	/**
	 * Zadatak: 2
	 * 
	 * (Enable GeometricObject comparable) Modify the GeometricObject class
	 * to implement the Comparable interface, and define a static max method in the
	 * GeometricObject class for finding the larger of two GeometricObject objects.
	 * Draw the UML diagram and implement the new GeometricObject class. Write
	 * a test program that uses the max method to find the larger of two circles and the
	 * larger of two rectangles.
	 */

	public static void main(String[] args) {
		
		/** Instantiate two circle objects with arguments */
		GeometricObject circle1 = new CircleFromGeometricObject(5.0);
		GeometricObject circle2 = new CircleFromGeometricObject(15.0);
		
		/** Instatiate two rectangle objects with arguments */
		GeometricObject rectangle1 = new RectangleFromGeometricObject(5.0, 10.0);
		GeometricObject rectangle2 = new RectangleFromGeometricObject(10.0, 15.0);
		
		/** Compare two circles and display result */
		GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
		System.out.printf("%s %.2f ", "Area of the largest circle is: ", largestCircle.getArea());
		System.out.printf("%s %.2f ", "\nPerimeter of the largest circle is: ", largestCircle.getPerimeter());
		
		System.out.println();
		System.out.println();
		
		/** Compare two rectangles and display result */
		GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
		System.out.printf("%s %.2f ", "Area of the largest rectangle is:", largestRectangle.getArea());
		System.out.printf("%s %.2f ", "\nPerimeter of the largest rectangle is:", largestRectangle.getPerimeter());
		
	}

}
