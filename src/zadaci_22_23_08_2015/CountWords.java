package zadaci_22_23_08_2015;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CountWords {
	
	/**
	 * Zadatak: 3
	 * 
	 *  (Count words) Write a program that counts the number of words in President
	 *  Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
	 *  Lincoln.txt.
	 */

	public static void main(String[] args) {
		
		int numOfWords = 0; // Number of words - counter
		
		try {
			/** Load file from the url using openStream() method */
			InputStream file = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt").openStream();
			/** Create a Scanner to read data from the file */
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				/** Load data into string */
				String s = scan.nextLine();
				/** Count words in the file by splitting words by empty spaces
				 * and then using the length property */
				numOfWords += s.split(" ").length;
				System.out.println(s); // Display text from the file
			}
			scan.close(); // Close the Scanner
		/** Catch exception if file didn't find */	
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/** Display number of words */
		System.out.println("\nNumber of words from the Lincoln.txt file: " + numOfWords);
		
	}

}
