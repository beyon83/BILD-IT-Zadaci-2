package zadaci_09_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Stopwatch {

	/**
	 * Zadatak: 3.
	 * (Stopwatch) Design a class named StopWatch. The class contains:
	 * ■ Private data fields startTime and endTime with getter methods.
	 * ■ A no-arg constructor that initializes startTime with the current time.
	 * ■ A method named start() that resets the startTime to the current time.
	 * ■ A method named stop() that sets the endTime to the current time.
	 * ■ A method named getElapsedTime() that returns the elapsed time for the
	 * stopwatch in milliseconds.
	 * Write a test program that measures the execution time of sorting 
	 * 100,000 numbers using selection sort.
	 */
	
	private long startTime;
	private long endTime;
	
	/** Initialize no-args constructor with startTime */
	Stopwatch() {
		startTime = System.currentTimeMillis();
	}
	
	/** Start time method with current time */
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	/** Stop method with end time */
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	/** Return how much time is passed */
	public long getElapsedTime() {
		return endTime - startTime;
	}
	
	/** Return start time */
	public long getStartTime() {
		return startTime;
	}
	
	/** Return end time */
	public long getEndTime() {
		return endTime;
	}
	
////////////////////////////////////////////////////////////
	                 /** Main */
////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		/** Create ArrayList to store numbers */
		ArrayList<Integer> list = new ArrayList<>();
		
		/** Random instance */
		Random rand = new Random();
		
		/** Invoke no-args constructor */
		Stopwatch stopwatch = new Stopwatch();
		
		/** Invoke start method to start measure the time */
		stopwatch.start();
		
		/** Add 100k random numbers to the ArrayList */
		for(int i = 0; i < 100000; i++) {
			list.add(rand.nextInt(9));
		}
		
		/** Sort numbers in ArrayList using the sort() method */
		Collections.sort(list);
		
		/** Display sorted numbers */
		for(Integer l: list) {
			System.out.print(l + " ");
		}
		
		/** End measure of time */
		stopwatch.stop();
		
		/** Display elapsed time */
		System.out.println("Elapsed time for sorting elements is: " + stopwatch.getElapsedTime() + " milliseconds");
		
	}

}
