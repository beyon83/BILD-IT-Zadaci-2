package zadaci_25_08_2015;

public class ComparableCircleMain {

	public static void main(String[] args) {
		
		/** Instatiate two circle objects with arguments */
		ComparableCircle circle1 = new ComparableCircle(8);
		ComparableCircle circle2 = new ComparableCircle(7);
		
		/** Call max method to compare two objects and display result */
		ComparableCircle largestCircle = ComparableCircle.max(circle1, circle2);
		System.out.printf("%s %.2f ", "Area of the largest circle is: ", largestCircle.getArea());
		
	}

}
