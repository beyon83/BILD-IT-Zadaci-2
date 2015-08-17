package zadaci_15_08_2015;

public class ImplementStringClass2 {
	
	/**
	 * Zadatak: 2
	 * 
	 * (Implement the String class) The String class is provided in the Java library.
	 * Provide your own implementation for the following methods (name the new
	 * class MyString2):
	 * public MyString2(String s);
	 * public int compare(String s);
	 * public MyString2 substring(int begin);
	 * public MyString2 toUpperCase();
	 * public char[] toChars();
	 * public static MyString2 valueOf(boolean b);
	 */
	
////////////////////////////////////////////////////////
	                /** Main */
////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		MyString2 str = new MyString2("java");
		
		System.out.println("Compare strings: " + str.compare("java"));
		System.out.print("Return substring(): ");
		str.substring(2).displayString();
		System.out.print("\nString toUpperCase(): ");
		str.toUpperCase().displayString();
		System.out.print("\nString to char[] array: ");
		System.out.println(str.toChars());
		System.out.print("valueOf(boolean): ");
		MyString2.valueOf(false).displayString();
		
	}

}

////////////////////////////////////////////////////////
               /** MyString2 Class */
////////////////////////////////////////////////////////

class MyString2 {
	
	private String s;
	
	/** Constructor that creates string */
	public MyString2(String s) {
		this.s = s;
	}
	
	/** Compare method */
	public int compare(String s) {
		
		/** Check if length of two strings is equal */
		if(this.s.length() > s.length()) {
			return 1; // if length of the first string is greater than second one, return 1
		} else if(this.s.length() < s.length()){
			return -1; // otherwise return -1
		}
		
		/** If length is same, check for characters */
		if(this.s.length() == s.length()) {
			char[] ch1 = this.s.toCharArray(); // convert string into char[] array
			char[] ch2 = s.toCharArray(); // convert second string into char[] array
			for(int i = 0; i < this.s.length(); i++) {
				if(ch1[i] > ch2[i]) { // compare characters
					return 1;
				} else if(ch1[i] < ch2[i]) {
					return -1;
				} 
			}
		}
		return 0; // if they are equal, return 0
	}
	
	/** Method for displaying string */
	public MyString2 displayString() {
		for(int i = 0; i < this.s.length(); i++) {
			System.out.print(this.s.charAt(i));
		}
		return this;
	}
	
	/** Return substring at specified index (begin) */
	public MyString2 substring(int begin) {
		return new MyString2(this.s.substring(begin));
	}
	
	/** Return string to upper case */
	public MyString2 toUpperCase() {
		return new MyString2(this.s.toUpperCase());
	}
	
	/** Returns string to character */
	public char[] toChars() {
		char[] chArr = this.s.toCharArray();
		return chArr;
	}
	
	public static MyString2 valueOf(boolean b) {
		String s = String.valueOf(b);
		return new MyString2(s);
	}
	
}
