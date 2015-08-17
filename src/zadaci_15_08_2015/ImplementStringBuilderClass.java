package zadaci_15_08_2015;

public class ImplementStringBuilderClass {
	
	/**
	 * Zadatak: 5
	 * 
	 *  (Implement the StringBuilder class) The StringBuilder class is provided
	 *  in the Java library. Provide your own implementation for the following methods
	 *  (name the new class MyStringBuilder1):
	 *  public MyStringBuilder1(String s);
	 *  public MyStringBuilder1 append(MyStringBuilder1 s);
	 *  public MyStringBuilder1 append(int i);
	 *  public int length();
	 *  public char charAt(int index);
	 *  public MyStringBuilder1 toLowerCase();
	 *  public MyStringBuilder1 substring(int begin, int end);
	 *  public String toString();
	 */

	public static void main(String[] args) {
		
		/** Instantiate first object */
		MyStringBuilder1 strBuilder1 = new MyStringBuilder1("sTriNg1");
		
		/** Instantiate second object */
		MyStringBuilder1 strBuilder2 = new MyStringBuilder1("strinG2");
		
		/** Display results */
		System.out.println("append(string): " + strBuilder1.append(strBuilder2));
		System.out.println("append(int): " + strBuilder1.append(100));
		System.out.println("length(): " + strBuilder1.length());
		System.out.println("charAt(): " + strBuilder1.charAt(5));
		System.out.println("toLowerCase(): " + strBuilder1.toLowerCase());
		System.out.println("substring(begin, end): " + strBuilder1.substring(2, 5));
		
	}

}

////////////////////////////////////////////////////////
              /** MyStringBuilder Class */
////////////////////////////////////////////////////////

class MyStringBuilder1 {
	
	private String s;
	
	/** Constructor that constructs a string */
	public MyStringBuilder1(String s) {
		this.s = s;
	}
	
	/** Return method that appends one string to another */
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		this.s = this.s + s.s;
		return new MyStringBuilder1(this.s);
	}
	
	/** Append integer to the string */
	public MyStringBuilder1 append(int i) {
		this.s = this.s + i;
		return new MyStringBuilder1(this.s);
	}
	
	/** Return length of the string builder */
	public int length() {
		return this.s.length();
	}
	
	public char charAt(int index) {
		return this.s.charAt(index);
	}
	
	/** Returns string to lower case */
	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(this.s.toLowerCase());
	}
	
	/** Returns substring of the string from begin index to end index */
	public MyStringBuilder1 substring(int begin, int end) {
		String s = "";
		for(int i = begin; i < end; i++) {
			s = s + this.s.charAt(i);
		}
		return new MyStringBuilder1(s);
	}
	
	/** toString() method that returns string */
	public String toString() {
		return this.s;
	}
	
}
