package zadaci_17_08_2015;

public class Staff extends Employee {

	private String title;
	
	Staff() {
		
	}
	
	/** Constructor for name, address, phone number, etc, etc. */
	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salary, String title) {
		/** Call superclass's constructor */
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	/** toString() method for name of the class and name of the person */
	public String toString() {
		return this.getClass() + " Name: " + getName();
	}
	
}
