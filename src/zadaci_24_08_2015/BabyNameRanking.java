package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNameRanking {
	
	/**
	 * Zadatak: 3
	 * 
	 * (Baby name popularity ranking) The popularity ranking of baby names from
	 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
	 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
	 * babynameranking2010.txt. Each file contains one thousand lines. Each line
	 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
	 * and number for the girl’s name. For example, the first two lines in the file
	 * babynameranking2010.txt are as follows:
	 * 
	 * 1. Jacob   21,875   Isabella   22,731
	 * 2. Ethan   17,866   Sophia    20,477
	 * 
	 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
	 * name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
	 * Jacob and 22,731 girls are named Isabella. Write a program that prompts the
	 * user to enter the year, gender, and followed by a name, and displays the ranking
	 * of the name for the year. 
	 * 
	 * Here is a sample run:
	 * 
	 * Enter the year: 2010
	 * Enter the gender: M
	 * Enter the name: Javier
	 * Javier is ranked #190 in year 2010
	 * 
	 * Enter the year: 2010
	 * Enter the gender: F
	 * Enter the name: ABC
	 * The name ABC is not ranked in year 2010
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt the user to enter the year in the range from 2005 to 2010 */
		System.out.println("Enter the year in the range from 2005 to 2010: ");
		int year = input.nextInt();
		while(year < 2005 || year > 2010) {
			System.out.println("Please enter the year in the range of 2005 - 2010");
			year = input.nextInt();
		}
		
		/** Enter gender */
		System.out.println("Enter the gender(M for male, F for female): ");
		String gender = input.next().toUpperCase();
		
		/** Enter a name */
		System.out.println("Enter the name: ");
		String name = input.next();
		
		/** Create File object for the text file */
		File file = new File("babynameranking" + year + ".txt");
		
		try {
			
			/** Create Scanner to read from the file */
			Scanner scan = new Scanner(file);
			
			while(scan.hasNext()) {
				
				int rankNumber = scan.nextInt(); // rank
				String genderM = scan.next(); // name of the boy
				int numbOfBoys = scan.nextInt(); // number of boys with same name
				String genderF = scan.next(); // name of the girl
				int numbOfGirls = scan.nextInt(); // number of girls with same name
				
				/** If entered name corresponds to the name from the file */
				if(name.equals(genderM) && gender.equals("M")) {
					/** Display that name and his rank */
					System.out.println(genderM + " is ranked #" + rankNumber + " in year " + year);
					System.out.println("There is a " + numbOfBoys + " boys with the same name.");
				} else {
					System.out.println("The name " + name + " is not ranked in year " + year);
					break;
				}
				/** If entered name corresponds to the name from the file */
				if(gender.equals("F") && name.equals(genderF)) {
					/** Display that name and her rank */
					System.out.println(genderF + " is ranked #" + rankNumber + " in year " + year);
					System.out.println("There is a " + numbOfGirls + " girls with the same name.");
				} else {
					System.out.println("The name " + name + " is not ranked in year " + year);
					break;
				}
			}
			scan.close(); // close scanner
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		input.close();
	}

}
