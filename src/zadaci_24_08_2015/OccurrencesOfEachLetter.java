package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OccurrencesOfEachLetter {
	
	/**
	 * Zadatak: 2
	 * 
	 * (Occurrences of each letter) Write a program that prompts the user to enter
	 * a file name and displays the occurrences of each letter in the file. Letters are
	 * case-insensitive. Here is a sample run:
	 * 
	 * Enter a filename: Lincoln.txt
	 * Number of A's: 56
	 * Number of B's: 134
	 * ...
	 * Number of Z's: 9
	 */

	public static void main(String[] args) {
		
		/** Prompt the user to name of the file in input dialog box */
		String fileName = JOptionPane.showInputDialog("Unesite ime fajla: ");
		
		/** File object for file */
		File fileRead = new File(fileName);
		
		/** If entered file doesn't exist, pop-up dialog box with message */
		if(!fileRead.exists()) {
			JOptionPane.showMessageDialog(null, "File you entered, doesn't exist!");
			System.exit(0);
		}
		
		try {
			/** Counter for each letter */
			int[] lettersCounter = new int[26];
			
			/** Array of letters */
			char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			
			/** Scanner for reading the file */
			Scanner scan = new Scanner(fileRead);
			
			while(scan.hasNext()) {
				/** Read all content from the file */
				String str = scan.nextLine();
			//	System.out.println(str); // Display content from the file
				
				/** Count letters */
				for(int i = 0; i < str.length(); i++) {
					for(int j = 0; j < letters.length; j++) {
						if(str.charAt(i) == letters[j]) {
							/** If letter from text equals letters from array, count that letter */
							lettersCounter[j]++;
						}
					}
				}
				
			}
			/** Display occurred letters and how many times those letters have appeared */
			for(int i = 0; i < lettersCounter.length; i++) {
				if(lettersCounter[i] != 0) {
					System.out.println(letters[i] + " = " + lettersCounter[i]);
					/** OPTIONAL: display result using JOptionPane dialog box */
					JOptionPane.showMessageDialog(null, letters[i] + " = " + lettersCounter[i]);
				}
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
