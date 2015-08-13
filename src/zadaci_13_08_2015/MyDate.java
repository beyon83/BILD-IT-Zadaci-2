package zadaci_13_08_2015;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
	
	/**
	 * Zadatak: 4
	 * 
	 * (The MyDate class) Design a class named MyDate. The class contains:
	 * ■ The data fields year, month, and day that represent a date. month is
	 * 0-based, i.e., 0 is for January.
	 * ■ A no-arg constructor that creates a MyDate object for the current date.
	 * ■ A constructor that constructs a MyDate object with a specified elapsed time
	 * since midnight, January 1, 1970, in milliseconds.
	 * ■ A constructor that constructs a MyDate object with the specified year,
	 * month, and day.
	 * ■ Three getter methods for the data fields year, month, and day, respectively.
	 * ■ A method named setDate(long elapsedTime) that sets a new date for
	 * the object using the elapsed time.
	 * 
	 * Draw the UML diagram for the class and then implement the class. Write a
	 * test program that creates two MyDate objects (using new MyDate() and new
	 * MyDate(34355555133101L)) and displays their year, month, and day.
	 * (Hint: The first two constructors will extract the year, month, and day from
	 * the elapsed time. For example, if the elapsed time is 561555550000 milliseconds,
	 * the year is 1987, the month is 9, and the day is 18. 
	 * 
	 * You may use the GregorianCalendar class discussed in Programming Exercise 9.5 
	 * to simplify coding.)
	 */
	
	private int year;
	private int month;
	private int day;
	private Date currentDate;
	
	/** A no-arg constructor that creates a MyDate object for the current date */
	public MyDate() {
		Date date = new Date();
		currentDate = date;
	}
	
	/** constructs a MyDate object with a specified elapsed time
	 * since midnight, January 1, 1970, in milliseconds */
	public MyDate(long millis) {
		/** Create GregorianCalendar class */
		GregorianCalendar calendar = new GregorianCalendar();
		/** Use setTimeInMillis() method to convert milliseconds into date */
		calendar.setTimeInMillis(millis);
		/** Format date */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
		System.out.println(dateFormat.format(calendar.getTime()));
	}
	
	/** A constructor that constructs a MyDate object with the specified year,
	 * month, and day. */
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/** Getters */
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	/** Sets a new date for the object using the elapsed time */
	public void setDate(long elapsedTime) {
		/** GregorianCalendar constructor with specified year, month and day */
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		/** Convert milliseconds into date */
		calendar.setTimeInMillis(elapsedTime);
		/** Assign to year value of actual year */
		year = calendar.get(GregorianCalendar.YEAR);
		/** Assign to month value of actual month */
		month = calendar.get(GregorianCalendar.MONTH);
		/** Assign to day value of actual day */
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
///////////////////////////////////////////////////////////////////////////////
	                          /** Main */
///////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Instantiate an object */
		MyDate date = new MyDate();
		System.out.println("Current date: " + date.currentDate);
		
		/** Call constructor with argument */
		new MyDate(561555550000L);
		
		/** Set new date */
		date.setDate(561555550000L);
		
		/** Display getters */
		System.out.println("Year after setting setDate() method: " + date.getYear());
		System.out.println("Month after setting setDate() method: " + date.getMonth());
		System.out.println("Day after setting setDate() method: " + date.getDay());
		
	}

}
