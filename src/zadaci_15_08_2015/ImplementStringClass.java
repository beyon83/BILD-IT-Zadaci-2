package zadaci_15_08_2015;

public class ImplementStringClass {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Implement the String class) The String class is provided in the Java library.
	 * Provide your own implementation for the following methods (name the new
	 * class MyString1):
	 * public MyString1(char[] chars);
	 * public char charAt(int index);
	 * public int length();
	 * public MyString1 substring(int begin, int end);
	 * public MyString1 toLowerCase();
	 * public boolean equals(MyString1 s);
	 * public static MyString1 valueOf(int i);
	 */
	
///////////////////////////////////////////////////////////
                     /** Main */
///////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		/** Initialize char[] array */
		char[] characters = {'A', 'b', 'c', 'D', 'e', 'F', 'g'};
		char[] characters2 = {'A', 'b', 'c', 'D', 'e', 'F', 'g'};
		
		/** Instantiate an object */
		MyString1 karakteri = new MyString1(characters);
		
		/** Instantiate another object of characters 2 */
		MyString1 karakteri2 = new MyString1(characters2);
		
		/** Display results */
		System.out.println(karakteri.chars);
		System.out.println("charAt: " + karakteri.charAt(2));
		System.out.println("Length of characters array: " + karakteri.chars.length);
		System.out.print("substring(1, 3): ");
		karakteri.substring(1, 3).displayChars();
		System.out.print("\ntoLowerCase(): ");
		karakteri.toLowerCase();
		System.out.println("Is characters equal to characters2? " + karakteri.equals(karakteri2));
		System.out.print("valueOf(): ");
		MyString1.valueOf(5).displayChars();
		
	}

}

///////////////////////////////////////////////////////////
             /** Implementing MyString1 class */
///////////////////////////////////////////////////////////

class MyString1 {
	
	char[] chars;
	char[] ch;
	
	public MyString1() {
		
	}
	
	/** Constructor for char[] array */
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	
	/** Get char at certain index */
	public char charAt(int index) {
		return chars[index];
	}
	
	/** Get length of the array */
	public int length() {
		return chars.length;
	}
	
	/** Method used for displaying substring */
	public MyString1 displayChars() {
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
		return this;
	}
	
	/** Method that returns substring of the char[] array */
	public MyString1 substring(int begin, int end) {
		/** Create new char[] array */
		char[] sub = new char[end - begin];
		/** Copy char array into string to enable use of charAt() method */
		String s = new String(chars);
		/** Iterate through the array from begin index to the end index */
		for(int i = begin; i < end; i++) {
			sub[i - begin] = s.charAt(i);
		}
		/** Return result of the object type */
		MyString1 result = new MyString1(sub);
		return result;
	}
	
	/** Method that returns array to lower case letters */
	public MyString1 toLowerCase() {
		/** Copy char[] array into string */
		String s = new String(chars);
		System.out.println(s.toLowerCase());
		return this;
	}
	
	/** Check if two objects are equals */
	public boolean equals(MyString1 s) {
		
		for(int i = 0; i < s.length(); i++) {
			if(chars[i] != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	/** Convert integer to string */
	public static MyString1 valueOf(int i) {
		String s = String.valueOf(i);
		MyString1 str = new MyString1(s.toCharArray());
		return str;
	}
	
}
