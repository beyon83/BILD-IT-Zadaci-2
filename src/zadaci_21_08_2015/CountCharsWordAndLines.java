package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CountCharsWordAndLines {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Count characters, words, and lines in a file) Write a program that will count
	 * the number of characters, words, and lines in a file. Words are separated by
	 * whitespace characters.
	 */

	public static void main(String[] args) throws FileNotFoundException {
		
		/** Create file object for a .txt file */
		File file = new File("remove_text.txt");
		
		/** Create scanner to read from the file */
		Scanner input = new Scanner(file);
		
		int numOfChar = 0; // Counter for number of chars
		int numOfWords = 0; // Counter for number of words 
		int numOfLines = 0; // Counter for number of lines
		
		while(input.hasNext()) {
			/** Number of characters */
			String s1 = input.nextLine();
			String characters = s1.replaceAll(" ", ""); // Ignore empty spaces while counting characters
			numOfChar += characters.length(); // sum characters
			
			/** Number of words */
			numOfWords += s1.split(" ").length;
			
			/** Number of lines */
			numOfLines++;
		}
		input.close();

		/** Display result */
		System.out.println("Number of characters: " + numOfChar);
		System.out.println("Number of words: " + numOfWords);
		System.out.println("Number of lines: " + numOfLines);
		
		/** OPTIONAL: display result using JOptionPane message dialog box */
		JOptionPane.showMessageDialog(null, "Number of characters: " + numOfChar + "\nNumber of words: " + numOfWords + "\nNumber of lines: " + numOfLines, "Result: ", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
