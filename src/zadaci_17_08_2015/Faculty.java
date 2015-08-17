package zadaci_17_08_2015;

public class Faculty extends Employee {
	
	private int officeHours;
	private String rank;
	
	Faculty() {
		
	}
	
	/** Faculty constructor for name, address, etc. etc. */
	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String salary, int officeHours, String rank) {
		/** Call superclass's constructor */
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	/** Setters and getters */
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public int getOfficeHours() {
		return officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	/** toString() method for displaying name of the class and name of the person */
	public String toString() {
		return this.getClass() + " Name: " + getName();
	}

}
