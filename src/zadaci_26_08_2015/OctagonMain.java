package zadaci_26_08_2015;

public class OctagonMain {

	public static void main(String[] args) {
		
		/** Instantiate octagon object */
		Octagon oct1 = new Octagon(5);
		System.out.printf("%s %.2f", "Area of the octagon is:", oct1.getArea());
		
		/** Clone octagon object */
		Octagon oct2 = oct1.clone();
		
		/** Display result */
		System.out.println("\ncompareTo() " + oct1.compareTo(oct2));
		
	}

}
