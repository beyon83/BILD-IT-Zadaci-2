package zadaci_25_08_2015;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DisplayCalendars {
	
	/**
	 * Zadatak: 1
	 * 
	 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
	 * a calendar for a specified month using the Calendar and GregorianCalendar
	 * classes.
	 */
	
	/** ArrayList for storing reminder informations from the user */
	public static ArrayList<Calendar> list = new ArrayList<>();
	
	/** Data fields for year, month, day of the week, date and user's reminder */
	private int year;
	private int month;
	private int dayOfWeek;
	
	/** Empty/default constructor */
	DisplayCalendars() {
		
	}
	
	/** Create constructor for the calendar and set parameters */
	DisplayCalendars(int year, int month, int dayOfWeek) {
		this.year = year;
		this.month = month;
		this.dayOfWeek = dayOfWeek;
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static void printMonth(int month, int year) {
		/** Print header of the calendar */
		System.out.println("       " + getMonthName(month) + " " + year);
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		/** Instantiate an GregorianCalendar object */
		GregorianCalendar calendar = new GregorianCalendar();
		
		/** Set month and year based on user's input */
		calendar.clear(); // clear default properties of the current month
		calendar.set(year, month - 1, 1); // set year and month based on user's input
       
        /** Get the first day in the month */
        int startOfMonth = calendar.get(GregorianCalendar.DAY_OF_WEEK);
       
        /** Obtain number of days in a month */
        int numOfDays = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        
        /** Invoke method with first day in the month and actual days in the months */
        printMonthBody(startOfMonth, numOfDays);
		
	}
	
////////////////////////////////////////////////////////////////////////////////	
	
	public static void printMonthBody(int startOfMonth, int numOfDays) {
		
		int dayCounter = 0; // Counter for counting days in a week
		
		/** Enter empty spaces before first day of the month */
		for(int i = 1; i < startOfMonth; i++) {
			System.out.print("    ");
			dayCounter++; // Increment day counter
		}
		
		/** Iterate through actual count of certain month */
		for(int i = 1; i <= numOfDays; i++) {
			System.out.printf("%2d", i);
			dayCounter++; // Increment day counter 
			if(dayCounter == 7) { // When day counter reach 7
				dayCounter = 0;  // reset it so it can start from 0 again
				System.out.println(); // and print new line
			} else {
				System.out.print("  "); // Otherwise, print empty spaces between days
			}
		}
	}
	
/////////////////////////////////////////////////////////////////////////////	
	
	public static String getMonthName(int month) {
		/** Initialize an array of names of the months */
		String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" , "December"};
		String str = ""; // Create empty string for storing name of the month
		for(int i = 0; i < monthName.length; i++) {
			if(month == i) {
				str = monthName[i-1]; // Indices in array are 0-based, so January is 0, February 1, etc.
			} else if(month == 12) { 
				str = monthName[11];
			}
		}
		return str;
	}
	
////////////////////////////////////////////////////////////////////////////////
	
	/** Set up getters and setters for data fields */
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDayOfWeek() {
		return this.dayOfWeek;
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	
	public static void getDayOfWeek(int year, int month, int dayOfWeek, int date) {
		
		/** Call GregorianCalendar's constructor with specified year, month and day of the week */
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, dayOfWeek);
		
		/** Initialize an array of days in the week */
		String[] dayOfWeekArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		/** Initialize an array of months */
		String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" , "December"};
		
		year = calendar.get(GregorianCalendar.YEAR); // Get actual year using GregorianCalendar class
		month = calendar.get(GregorianCalendar.MONTH); // Get actual month using GregorianCalendar class
		System.out.println(year + " " + monthsArray[month] + " " + date + ". - " + dayOfWeekArray[calendar.get(GregorianCalendar.DAY_OF_WEEK) - 1]);;
		
	}
	
////////////////////////////////////////////////////////////////////////////
	                     /** Main */
////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter a month */
		System.out.println("Enter a month (as a number 1 - 12): ");
		int month = input.nextInt();
		
		/** Prompt the user to enter a year */
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		printMonth(month, year); // Invoke printMonth() method
		
		input.close();
		
	}

}
