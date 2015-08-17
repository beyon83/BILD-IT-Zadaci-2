package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Date;

public class LoanDateCircle {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
	 * object, a Date object, a string, and a Circle object to the list, and use a loop
	 * to display all the elements in the list by invoking the object’s toString()
	 * method.
	 */

	public static void main(String[] args) {
		
		/** Create ArrayList of objects */
		ArrayList<Object> list = new ArrayList<>();
		
		/** Instantiate loan object and add it to the ArrayList */
		Loan loan = new Loan(10000);
		list.add(loan);
		
		/** Instantiate date object and add it to the ArrayList */
		Date date = new Date();
		list.add(date);
		
		/** Instantiate String object and add it to the ArrayList */
		String s = new String("This is a string object");
		list.add(s);
		
		/** Instantiate Circle object and add it to the ArrayList */
		Circle circle = new Circle(5.0);
		list.add(circle);
		
		/** Display ArrayList of objects */
		for(Object l: list) {
			System.out.println(l);
		}
		
	}

}

///////////////////////////////////////////////////////
            /** Implement Loan class */
///////////////////////////////////////////////////////

class Loan {
	
	double balance;
	
	/** Loan constructor that constructs balance */
	public Loan(double balance) {
		this.balance = balance;
	}
	
	/** Getter method for balance */
	public double getBalance() {
		return balance;
	}
	
	/** Override toString() method */
	public String toString() {
		return "Balance: " + this.balance;
	}
	
}

///////////////////////////////////////////////////////
             /** Implement Circle class */
///////////////////////////////////////////////////////

class Circle {
	
double radius;
	
    /** Default empty constructor */
	public Circle() {
		
	}
	
	/** Circle constructor */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/** Get Area of the circle */
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Override toString() method */
	@Override
	public String toString() {
		return "Area of the circle (radius: " + radius + ") is " + getArea();
	}
	
}
