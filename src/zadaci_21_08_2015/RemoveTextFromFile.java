package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RemoveTextFromFile {
	
	/**
	 * Zadatak: 3
	 * 
	 * (Remove text) Write a program that removes all the occurrences of a specified
	 * string from a text file. For example, invoking
	 * java Exercise12_11 John filename
	 * removes the string John from the specified file. Your program should get the
	 * arguments from the command line.
	 */

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> list = new ArrayList<>();
		
		/** Create File object for the .txt file */
		File file = new File("remove_text.txt");
		
		/** Check if file exists
		if(file.exists()) {
			System.out.println("File is found. ");
		} else {
			System.out.println("File is not found. ");
		}
		*/
		
		/** OPTIONAL: Prompt user to enter string using JOptionPane dialog box */
		String removeWord = JOptionPane.showInputDialog(null, "Input a word that you want to remove from the file: ");
	//	String removeWord = input.next();
		
		try {
			/** Create a Scanner to read data from the file */
			Scanner readScan = new Scanner(file);
			
			/** Iterate through the while loop while hasNext() method read any data in the file */
			while(readScan.hasNext()) {
				
				/** Read word-by-word from the file */
				String words = readScan.next();
				
				/** Add words to the list */
				list.add(words);
				
			}
			readScan.close(); // Close the scanner
			
			/** Create PrintWriter object to write data to the text */
			PrintWriter writer = new PrintWriter(file);
			
			/** Remove input's word from the ArrayList */
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(removeWord)) {
					list.remove(list.get(i));
				} 
			}
			/** Overwrite the file with data from ArrayList */
			for(String l: list) {
				writer.print(l + " ");
			}
			writer.close(); // close the PrintWriter
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			/** Read and display data from the file */
			Scanner readScan2 = new Scanner(file);
			while(readScan2.hasNext()) {
				String s = readScan2.nextLine();
				/** OPTIONAL: display data using JOptionPane dialog box */
				JOptionPane.showMessageDialog(null, s, "Text without word: " + removeWord, JOptionPane.INFORMATION_MESSAGE);
			//	System.out.println(s);
			}
			readScan2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
