package zadaci_22_23_08_2015;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ProcessScoresFromWeb {
	
	/**
	 * Zadatak: 4
	 * 
	 * (Process scores in a text file on the Web) Suppose that the text file on the
	 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
	 * of scores. Write a program that reads the scores from the file and displays their
	 * total and average. Scores are separated by blanks.
	 */

	public static void main(String[] args) {
		
		int total = 0; // Sum of total scores
		double average = 0; // Average of the scores
		int countNumbers = 0; // Count amount of numbers
		
		try {
			
			/** Load file from the URL using openStream() method */
			InputStream file = new URL("http://cs.armstrong.edu/liang/data/Scores.txt").openStream();
			
			/** Create a Scanner to read data from the file */
			Scanner scan = new Scanner(file);
			
			while(scan.hasNext()) {
				/** Create "scores" variable to store every number to it */
				int scores = scan.nextInt();
				total += scores; // Calculate total sum of the scores
				countNumbers++; // Count numbers
				average = total / countNumbers; // Obtain average of the scores
			}
			scan.close(); // Close the Scanner
		/** Catch url not found exception if occur */	
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/** Display total and average */
		System.out.println("Total of the scores is: " + total + "\nAverage of the scores is: " + average);
		
	}

}
