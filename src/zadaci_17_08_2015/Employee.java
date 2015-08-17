package zadaci_17_08_2015;

public class Employee extends Person {

	private String office;
	private String salary;
	private java.util.Date dateHired;
	
	Employee() {
		
	}
	
	/** Employee constructor that constructs name, address, phone number, etc. */
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, String salary) {
		/** Use super keyword to call constructor from superclass */
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
	}
	
	/** Setter method for office */
	public void setOffice(String office) {
		this.office = office;
	}
	
	/** Setter method for salary */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	/** Getter method for office */
	public String getOffice() {
		return office;
	}
	
	/** Getter method for salary */
	public String getSalary() {
		return salary;
	}
	
	/** Method for Date */
	public java.util.Date getDateHired() {
		return dateHired = new java.util.Date();
	}
	
	/** Override toString() method */
	public String toString() {
		return this.getClass() + " Name: " + getName();
	}
	
}
