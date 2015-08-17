package zadaci_15_08_2015;

import java.util.ArrayList;

public class StringSplitMethod {
	
	/**
	 * Zadatak: 4
	 * 
	 * (New string split method) The split method in the String class returns an
	 * array of strings consisting of the substrings split by the delimiters. However, the
	 * delimiters are not returned. Implement the following new method that returns
	 * an array of strings consisting of the substrings split by the matching delimiters,
	 * including the matching delimiters.
	 * public static String[] split(String s, String regex)
	 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
	 * array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
	 * #, and e in an array of String.
	 */
	
	/** Split method that returns characters divided at regex - delimiters */
	public static String[] split(String s, String regex) {
		
		/** Create an ArrayList to store characters into it */
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i = 0; i < s.length(); i++) {
			/** Add characters without regex chars to the list using index "i", to
			 * store/add them at specified index */
			list.add(i, s.charAt(i));
			for(int j = 0; j < regex.length(); j++) {
				/** If characters from "s" string matching characters from regex string... */
				if(s.charAt(i) == regex.charAt(j)) {
					/** ...then overwrite list at specified index, using set(index, regex) method */
					list.set(i, regex.charAt(j));
				}
			}
		}
		
		/** Create an array of String, to copy back characters from the ArrayList into it */
		String[] array = new String[list.size()];
		
		/** Now when everything is set, convert Character ArrayList back to the String Array and return it */
		for(int i = 0; i < list.size(); i++) {
			array[i] = Character.toString(list.get(i));
		}
		
		return array;
	}
	
/////////////////////////////////////////////////////////////////
	                     /** Main */
/////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Invoke split() method with arguments: String, Regex */
		
		/** Call split method and assign expressions to the arguments */
	//	String[] s = split("ab#12#453", "#");
		String[] s = split("a?b?gf#e", "[?#]");
		
		/** Display result */
		for(String str: s) {
			System.out.print(str + " ");
		}
		
	}

}
