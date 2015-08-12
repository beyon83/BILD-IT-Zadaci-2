package zadaci_12_08_2015;

public class Time {
	
	/**
	 * Zadatak: 1
	 * 
	 * (The Time class) Design a class named Time. The class contains:
	 * ■ The data fields hour, minute, and second that represent a time.
	 * ■ A no-arg constructor that creates a Time object for the current time. (The
	 * values of the data fields will represent the current time.)
	 * ■ A constructor that constructs a Time object with a specified elapsed time
	 * since midnight, January 1, 1970, in milliseconds. (The values of the data
	 * fields will represent this time.)
	 * ■ A constructor that constructs a Time object with the specified hour, minute,
	 * and second.
	 * ■ Three getter methods for the data fields hour, minute, and second,
	 * respectively.
	 * ■ A method named setTime(long elapseTime) that sets a new time
	 * for the object using the elapsed time. For example, if the elapsed time is
	 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is
	 * 10.
	 * Draw the UML diagram for the class and then implement the class. Write
	 * a test program that creates two Time objects (using new Time() and new
	 * Time(555550000)) and displays their hour, minute, and second in the format
	 * hour:minute:second.
	 * (Hint: The first two constructors will extract the hour, minute, and second
	 * from the elapsed time. For the no-arg constructor, the current time can be
	 * obtained using System.currentTimeMillis(), as shown in Listing 2.7,
	 * ShowCurrentTime.java.)
	 */
	
	/** Data fields that represents hour, minute and second */
	long hour;
	long minute;
	long second;
	
	/** No-arguments constructor for current time */
	public Time() {
	//	long currentTime = System.currentTimeMillis();
     	second = (int) (System.currentTimeMillis() / 1000) % 60 ;
	    minute = (int) (System.currentTimeMillis() / 1000 / 60) % 60;
	    hour   = (int) (System.currentTimeMillis() / 1000 / 60 / 60) % 24;
	}
	
	/** Constructor for elapsed time */
	public Time(long elapsedTime) {
		second = elapsedTime % (1000 * 60 * 60) % (1000 * 60) / 1000;
	    minute = elapsedTime % (1000 * 60 * 60) / (1000 * 60);
	    hour = elapsedTime / (1000 * 60 * 60) % 24;
	}
	
	/** Constructor with hour, mminute and second */
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	/** Getters */
	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}
	
	public long getSecond() {
		return second;
	}
	
	/** Method for setting elapsed time */
	public void setTime(long elapsedTime) {
		long elapsedSeconds = elapsedTime / 1000;
		long elapsedMinutes = elapsedSeconds / 60;
		long elapsedHours = elapsedMinutes / 60;
		this.second = elapsedSeconds % 60;
		this.minute = elapsedMinutes % 60;
		this.hour = elapsedHours % 24;
	}
	
	/** toString() method for displaying time in 00:00:00 - format */
	public String toString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
////////////////////////////////////////////////////////////////////////
	                       /** Main */
////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** No-arguments constructor that shows current time */
		Time time1 = new Time();
		/** Constructor with elapsed time in milliseconds */
		Time time2 = new Time(555550000);
	//	time2.setTime(555550000);
			
		/** Display time */
		System.out.println("Time 1: " + time1.toString());
		System.out.println("Time 2: " + time2.toString());
		
	}

}
