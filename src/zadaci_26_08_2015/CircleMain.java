package zadaci_26_08_2015;

public class CircleMain {

	public static void main(String[] args) {
		
		/** Instantiate two circle objects */
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(10);
		
		/** Test and display compareTo() method */
		System.out.println("Returning result of comparing two circles: " + circle1.compareTo(circle2));
		
		/** Test and display equals() method */
		System.out.println("Two objects are equal? " + circle1.equals(circle2));
		
	}

}
