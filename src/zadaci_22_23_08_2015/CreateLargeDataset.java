package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateLargeDataset {
	
	/** 
	 * Zadatak: 5
	 * 
	 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
	 * consists of a faculty member’s first name, last name, rank, and salary. The
	 * faculty member’s first name and last name for the ith line are FirstNamei and
	 * LastNamei. The rank is randomly generated as assistant, associate, and full.
	 * The salary is randomly generated as a number with two digits after the decimal
	 * point. The salary for an assistant professor should be in the range from 50,000
	 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
	 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
	 * FirstName1 LastName1 assistant 60055.95
	 * FirstName2 LastName2 associate 81112.45
	 * . . .
	 * FirstName1000 LastName1000 full 92255.21
	 */
	
	/** Method to obtain proper salary for the rank */
	public static double getSalary(String[] ranks, int rand) {
		
		double salary = 0; // Declare salary
		
		/** Check obtained random number passed through the argument
		 * if corresponds either to the assistant, associate or full member in the ranks[] array */
		if(ranks[rand] == "assistant") {
			salary = 50000 + (double)(Math.random() * (80000 - 50000));
		} else if(ranks[rand] == "associate") {
			salary = 60000 + (double)(Math.random() * (110000 - 60000));
		} else if(ranks[rand] == "full") { 
			salary = 75000 + (double)(Math.random() * (130000 - 75000));
		}
		/** Return result with two digits after decimal point */
		return salary = Math.round(salary * 100.0) / 100.0;
	}
	
/////////////////////////////////////////////////////////////////
	                   /** Main */
/////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Initialize an array with ranks */
		String[] ranks = {"assistant", "associate", "full"};
		
		/** Create file object for .txt file */
		File file = new File("Salary.txt");
		
		try {
			/** Create PrintWriter to write data to the file */
			PrintWriter writer = new PrintWriter(file);
			for(int i = 1; i < 1000 + 1; i++) {
				/** Get random number in the range of 0 - 2 */
				int rand = (int)(Math.random() * 3);
				/** Write data to the file: FirstName, index "i" append to the name, random rank, and proper salary for the rank */
				writer.println("FirstName" + i + " LastName" + i + " " + ranks[rand] + " " + getSalary(ranks, rand));
			}
			writer.close(); // Close the PrintWriter
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
