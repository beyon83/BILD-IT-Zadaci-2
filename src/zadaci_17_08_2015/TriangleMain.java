package zadaci_17_08_2015;

import java.util.Scanner;

public class TriangleMain {
	
	public static void main(String[] args) {
		
		/** Prompt the user to enter length of the sides of the triangle */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dimenzije trougla: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		/** Enter a color */
		System.out.println("Unesite boju: ");
		String boja = input.next();
		
		/** Is triangle filled? */
		System.out.println("Unesite da li je true ili false: ");
		boolean trueOrFalse = input.nextBoolean();
		
		/** Instantiate geometric object */
		GeometricObject gObject = new GeometricObject();
		gObject.setColor(boja); // set color
		gObject.setTrueOrFalse(trueOrFalse); // set boolean
		System.out.println("Boja je: " + gObject.getColor()); // obtain color
		System.out.println("Objekat je ispunjen ili ne: " + gObject.getTrueOrFalse());
		
		/** Instantiate triangle object with specified sides */
		Triangle triangle = new Triangle(side1, side2, side3);
		System.out.println(triangle);
		System.out.println(triangle.getArea());
		triangle.getArea();
		
		input.close();
	}

}
