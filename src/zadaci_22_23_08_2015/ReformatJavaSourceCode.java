package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReformatJavaSourceCode {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Reformat Java source code) Write a program that converts the Java source
	 * code from the next-line brace style to the end-of-line brace style. For example,
	 * the following Java source in (a) uses the next-line brace style. Your program
	 * converts it to the end-of-line brace style in (b).
	 * 
	 *    (a)
	 *    public class Test
	 *    {
	 *       public static void main(String[] args)
	 *       {
	 *       // Some statements
	 *       }
	 *    }
	 *    
	 *    (b)
	 *    public class Test {
	 *        public static void main(String[] args) {
	 *       // Some statements
	 *       }
	 *    }
	 */

	public static void main(String[] args) {
		
		/** Create File object for .txt file */
		File file = new File("reformat_source_code.txt");
		
		int counter = 0;
		
		try {
			/** Create Scanner to read file */
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				/** Create string to read every line in the file */
				String s = scan.next();
				/** If "}" doesn't appear in the line... */
				if(!s.equals("}")) {
					/** ...print that line */
					System.out.print(s + " ");
				}
				/** If "{" appears in the line... */
				if(s.equals("{")) {
					/** ...print new line with "\t" empty spaces */
					System.out.print("\n\t");
				/** If "}" appears in the line... */	
				} else if(s.equals("}")) {
					/** ...print new line */
					System.out.print("\n");
					while(counter < 1) {
						/** Print empty spaces */
						System.out.print("        ");
						counter++;
					}
					/** Print lines */
					System.out.print(s);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
