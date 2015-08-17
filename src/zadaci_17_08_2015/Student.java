package zadaci_17_08_2015;

public class Student extends Person {

	private final String CLASS_STATUS;
	
	/** Constructor that creates name, address, phone num, etc. etc. */
	public Student(String name, String address, String phoneNumber, String emailAddress, String CLASS_STATUS) {
		/** Call superclass constructor */
		super(name, address, phoneNumber, emailAddress);
		this.CLASS_STATUS = CLASS_STATUS;
	}
	
	public Student(String CLASS_STATUS) {
		this.CLASS_STATUS = CLASS_STATUS;
	}
	
	public String toString() {
		return this.getClass() + " Name: " + getName();
	}
	
}
