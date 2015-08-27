package zadaci_26_08_2015;

import java.util.ArrayList;

public class CourseCloneable implements Cloneable {
	
	/**
	 * Zadatak: 5
	 * 
	 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
	 * to add a clone method to perform a deep copy on the students field.
	 */
	
	/** Declare data fields */
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	static int numberOfStudents = 0;
	
	/** Empty constructor */
	public CourseCloneable() {
		
	}
	
	/** Constructor with specified course name */
	public CourseCloneable(String courseName) {
		this.courseName = courseName;
	}
	
	/** Setters and Getters */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	/** Add students to the list */
	public void addStudents(String students) {
		this.students.add(students);
		numberOfStudents++;
	}
	
	public ArrayList<String> getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	/** Remove students */
	public void dropStudent(String students) {
		this.students.remove(students);
		numberOfStudents--;
	}
	
	/** Clear ArrayList */
	public void clear() {
		students.clear();
		numberOfStudents = 0;
	}
	
	/** Override clone() method and copy content from one list to another list */
	@Override
	public ArrayList<String> clone() {
		ArrayList<String> listClone = new ArrayList<>();
		for(int i = 0; i < students.size(); i++) {
			listClone = students; // copy students to the listClone
		}
		return listClone; // return listClone
	}
	
	@Override
	public String toString() {
		return "Course is about " + getCourseName() + ".\nNumber of students attending the course is: " + getNumberOfStudents() + "\nNames of the students: " + getStudents();
	}
	
//////////////////////////////////////////////////////////////////
	                    /** Main */
//////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Instantiate Course object */
		CourseCloneable course = new CourseCloneable("Java");
		/** Add students to the list passing by addStudends() method */
		course.addStudents("Bojan");
		course.addStudents("Mladen");
		course.addStudents("Slavisa");
	//	course.dropStudent("");
		
		System.out.println(course.toString());
		System.out.println("Cloned content: " + course.clone());
		
	}

}
