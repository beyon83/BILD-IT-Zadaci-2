package zadaci_26_08_2015;

public class RectangleMain {

	public static void main(String[] args) {
		
		/** Instantiate two rectangle objects */
		Rectangle rect1 = new Rectangle(15, 5);
		Rectangle rect2 = new Rectangle(15, 10);
		
		/** Test and display compareTo() method */
		System.out.println("Returning result of comparing two rectangles: " + rect1.compareTo(rect2));
		
		/** Test and display equals() method */
		System.out.println("Two objects are equal? " + rect1.equals(rect2));
		
	}

}
