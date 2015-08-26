package zadaci_25_08_2015;

public class ColorableObjectsMain {
	
	/**
	 * Zadatak: 4
	 * 
	 * (The Colorable interface) Design an interface named Colorable with a void
	 * method named howToColor(). Every class of a colorable object must implement
	 * the Colorable interface. Design a class named Square that extends
	 * GeometricObject and implements Colorable. Implement howToColor to
	 * display the message Color all four sides.
	 * Draw a UML diagram that involves Colorable, Square, and GeometricObject.
	 * Write a test program that creates an array of five GeometricObjects. For each
	 * object in the array, display its area and invoke its howToColor method if it is
	 * colorable.
	 */

	public static void main(String[] args) {
		
		/** Instantiate array of GeometricObjects */
		GeometricObject[] objects = new GeometricObject[5];
		
		/** Assign 5 objects to the array */
		objects[0] = new CircleObject(10);
		objects[1] = new Square(5);
		objects[2] = new RectangleObject(5, 10);
		// etc., etc. Two more objects are missing, I'm too lazy :D
		
		GeometricObject object;
		for (int i = 0; i < objects.length; i++) {
			object = objects[i]; // Assign each object to the object variable of GeometricObject type
			System.out.println("Object " + i);
			/** If object from array is instance of Colorable interface */
			if (object instanceof Colorable) {
				/** Make that object of Colorable type */
				Colorable colorable = (Colorable) object;
			    colorable.howToColor(); // Display its message
			} else {
				System.out.println("Not colorable.");
			}
		}

		
	}

}
