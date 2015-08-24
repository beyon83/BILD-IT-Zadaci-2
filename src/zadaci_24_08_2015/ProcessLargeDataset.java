package zadaci_24_08_2015;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ProcessLargeDataset {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Process large dataset) A university posts its employees’ salaries at http://
	 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
	 * member’s first name, last name, rank, and salary (see Programming Exercise
	 * 12.24). Write a program to display the total salary for assistant professors,
	 * associate professors, full professors, and all faculty, respectively, and display
	 * the average salary for assistant professors, associate professors, full professors,
	 * and all faculty, respectively.
	 */

	public static void main(String[] args) {
		
		/** Sum for assistant, associate, full and all faculty */
		int totalAssistant = 0;
		int totalAssociate = 0;
		int totalFull = 0;
		int totalFaculty = 0;
		
		/** Counter for assistant, associate, full and all faculty */
		int assistantCounter = 0;
		int associateCounter = 0;
		int fullCounter = 0;
		int facultyCounter = 0;
		
		/** Average for assistant, associate, full and all faculty */
		double averageAssistant = 0;
		double averageAssociate = 0;
		double averageFull = 0;
		double averageFaculty = 0;
		
		try {
			/** Load file from the URL using openStream() method */
			InputStream file = new URL("http://cs.armstrong.edu/liang/data/Salary.txt").openStream();
			
			/** Scanner for reading the file */
			Scanner scan = new Scanner(file);
			
			while(scan.hasNext()) {
				
				String fistName = scan.next(); // First name
				String lastName = scan.next(); // Last name
				String rank = scan.next(); // Rank of faculty
				double scores = scan.nextDouble(); // Scores
				
				if(rank.equals("assistant")) {
					totalAssistant += scores; // Sum assistant scores
					assistantCounter++; // Count assistant
				} else if(rank.equals("associate")) {
					totalAssociate += scores; // Sum associate
					associateCounter++; // Count associate
				} else if(rank.equals("full")) {
					totalFull += scores; // Sum full
					fullCounter++; // Count full
				}
				
				totalFaculty += scores; // Sum all faculty
				facultyCounter++; // Count all faculty
			}
			scan.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/** Obtain average of assistant, associate, full and all faculty */
		averageAssistant = totalAssistant / assistantCounter;
		averageAssociate = totalAssociate / associateCounter;
		averageFull = totalFull / fullCounter;
		averageFaculty = totalFaculty / facultyCounter;
		
		/** Display results */
		System.out.println("Total salary for assistant: " + totalAssistant + " | Average for assistant: " + averageAssistant);
		System.out.println("Total salary for associate: " + totalAssociate + " | Average for associate: " + averageAssociate);
		System.out.println("Total salary for full: " + totalFull + " | Average for full: " + averageFull);
		System.out.println("Total salary for all faculty: " + totalFaculty + " | Average for all faculty: " + averageFaculty);
		
	}

}
