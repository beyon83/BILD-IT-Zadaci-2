package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProcessScores {
	
	/**
	 * Zadatak: 5
	 * 
	 * (Process scores in a text file) Suppose that a text file contains an unspecified
	 * number of scores separated by blanks. Write a program that prompts the user
	 * to enter the file, reads the scores from the file, and displays their total and
	 * average.
	 */

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Integer> list = new ArrayList<>(); 
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter name of the file (e.g. "process_scores.txt") */
		System.out.println("Enter name of the file that you want read data from: ");
		
		/** OPTIONAL: Prompt the user to enter name of the file using JOptionPane input dialog box */
		String fileSearch = JOptionPane.showInputDialog(null, "Enter name of the file that you want read data from:", "Enter: process_scores.txt", JOptionPane.INFORMATION_MESSAGE);
	//	String fileSearch = input.next();
		
		/** Create scan that reads from the file */
		Scanner scan = new Scanner(new File(fileSearch));
		
		int sum = 0;
		double average = 0;
		
		while(scan.hasNext()) {
			/** While scan reads data from the file */
			int number = scan.nextInt();
			/** Add numbers to the ArrayList */
			list.add(number);
		}
		scan.close(); // Close the Scanner
		
		/** Get the sum from ArrayList */
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		/** Obtain average */
		average = sum / list.size();
		
		/** Display numbers from ArrayList */
		System.out.println("Numbers in the file: ");
		for(Integer l: list) {
			System.out.print(l + " ");
		}
		
		/** Display sum and average */
		System.out.println("\nSum is: " + sum);
		System.out.println("Average is: " + average);
		
		input.close();
	}

}
