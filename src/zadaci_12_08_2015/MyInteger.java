package zadaci_12_08_2015;

public class MyInteger {
	
	/**
	 * Zadatak: 2
	 * 
	 * (The MyInteger class) Design a class named MyInteger. The class contains:
	 * ■ An int data field named value that stores the int value represented by this
	 * object.
	 * ■ A constructor that creates a MyInteger object for the specified int value.
	 * ■ A getter method that returns the int value.
	 * ■ The methods isEven(), isOdd(), and isPrime() that return true if the
	 * value in this object is even, odd, or prime, respectively.
	 * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
	 * return true if the specified value is even, odd, or prime, respectively.
	 * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
	 * isPrime(MyInteger) that return true if the specified value is even, odd,
	 * or prime, respectively.
	 * ■ The methods equals(int) and equals(MyInteger) that return true if
	 * the value in this object is equal to the specified value.
	 * ■ A static method parseInt(char[]) that converts an array of numeric
	 * characters to an int value.
	 * ■ A static method parseInt(String) that converts a string into an int
	 * value.
	 * Draw the UML diagram for the class and then implement the class. Write a client
	 * program that tests all methods in the class.
	 */
	
	int value = 0;
	
	MyInteger(int value) {
		this.value = value;
	}
	
	/** Get method that returns value */
	public int getValue() {
		return value;
	}
	
	/** Returning method for even number */
	public boolean isEven(int number) {
		if(number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/** Returning method for odd number */
	public boolean isOdd(int number) {
		return !isEven(number);
	}
	
	/** Returning method for prime number */
	public boolean isPrime(int number) {
		if(number % 2 == 0) {
			return false;
		}
		return true;
	}
	
	/** Returning method for even number */
	public static boolean isEven(MyInteger number) {
		return isEven(number);
	}
	
	/** Returning method for odd number */
	public static boolean isOdd(MyInteger number) {
		return isOdd(number);
	}
	
	/** Returning method for prime number */
	public static boolean isPrime(MyInteger number) {
		return isPrime(number);
	}
	
	/** Returning method for equal number */
	public boolean equals(int number) {
		return value == number;
	}
	
	/** Returning method for equal number */
	public boolean equals(MyInteger number) {
		return equals(number.getValue());
	}
	
	/** Returning method for converting character to number */
	public static int parseInt(char[] numericChar) {
		/** Create String object, and assign character's value to it */
		String s = new String(numericChar);
		return parseInt(s); 
	}
	
	/** Converting String into number */
	public static int parseInt(String numericString) {
		/** Convert string into integer */
		int number = Integer.parseInt(numericString);
		return number;
	}
	
/////////////////////////////////////////////////////////////////////////////	
	                         /** Main */
/////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		int number = 4;
		int number2 = 7;
		
		/** Call constructor and set one integer argument */
		MyInteger value = new MyInteger(number2);
		System.out.println("value is: " + value.getValue());
		
		int number3 = 4;
		
		String str = "245"; // Create numeric string
		char[] charArr = {'2', '4', '5'}; // Create numeric character array
		
		/** Call constructor */
		MyInteger value2 = new MyInteger(number3);
		
		/** Invoke methods and display results */
		System.out.println("Is number " + number + " even? " + value.isEven(number));
		System.out.println("Is number " + number + " odd? " + value.isOdd(number));
		System.out.println("Is number " + number + " prime number? " + value.isPrime(number));
		System.out.println("Is number " + number + " equal " + number2 + "? " + value.equals(number));
		System.out.println("Is number " + number + " equal " + number3 + "? " + value2.equals(number));
		System.out.println("Numeric string " + str + " converted to integer: " + parseInt(str));
		System.out.println("Numeric character array " + charArr[0] + charArr[1] + charArr[2] + " converted to integer: " + parseInt(charArr));
		
	}

}
