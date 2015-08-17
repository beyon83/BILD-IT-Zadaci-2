package zadaci_15_08_2015;

public class ImplementCharacterClass {
	
	/**
	 * Zadatak: 3
	 * 
	 * (Implement the Character class) The Character class is provided in the Java
	 * library. Provide your own implementation for this class. Name the new class
	 * MyCharacter.
	 */

	public static void main(String[] args) {
		
		/** Instantiate character object */
		MyCharacter myChars = new MyCharacter('x');
		
		/** Display results */
		System.out.println("Character: " + myChars);
		System.out.print("toString(): " + myChars.toString());
		System.out.println("\ntoInteger(): " + MyCharacter.toInteger('1'));
		System.out.print("toLowerCase(): ");
		myChars.toLowerCase();
		System.out.print("toUpperCase(): ");
		myChars.toUpperCase();
		
	}

}

////////////////////////////////////////////////////////
              /** MyCharacter Class */
////////////////////////////////////////////////////////

class MyCharacter {
	
	private char ch;
	
	/** Constructor that constructs a character */
	public MyCharacter(char ch) {
		this.ch = ch;
	}
	
	/** Character to string
	public MyCharacter toStr() {
		String s = String.valueOf(this.ch);
		System.out.println(s);
		return this;
	}
	*/
	
	/** toString() method for displaying results */
	public String toString() {
		String s = String.valueOf(this.ch);
		return s;
	}
	
	public static int toInteger(char c) {
		int i = Integer.parseInt(c + "");
		return i;
	}
	
	/** Character to lower case */
	public MyCharacter toLowerCase() {
		String s = String.valueOf(this.ch).toLowerCase();
		System.out.println(s);
		return this;
	}
	
	/** Character to upper case */
	public MyCharacter toUpperCase() {
		String s = String.valueOf(this.ch).toUpperCase();
		System.out.println(s);
		return this;
	}
	
}
