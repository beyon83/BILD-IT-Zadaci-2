package zadaci_26_08_2015;

public class SumAreasOfGeometricObjects {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Sum the areas of geometric objects) Write a method that sums the areas of all the
	 * geometric objects in an array. The method signature is:
	 * public static double sumArea(GeometricObject[] a)
	 * Write a test program that creates an array of four objects (two circles and two
	 * rectangles) and computes their total area using the sumArea method.
	 */
	
	/** Method for summing areas of geometric objects */
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i].getArea(); // sum areas of objects
		}
		return sum; // return result
	}

	public static void main(String[] args) {
		
		/** Instantiate Geometric Objects */
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(10, 5);
		Octagon octagon = new Octagon(8);
		
		/** Initialize array of geometric objects */
		GeometricObject[] objects = {circle, rectangle, octagon};
		
		/** Display result */
		System.out.println("Sum of areas from geometric objects is: " + sumArea(objects));
		
	}

}
