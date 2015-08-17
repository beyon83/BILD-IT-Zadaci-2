package zadaci_17_08_2015;

public class GeometricObject {
	
	/** Declare data fields */
	private boolean trueOrFalse;
	
	private String color = "white";
	private java.util.Date dateCreated;
	
	/** Constructor that creates time for geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/** Getters and setters */
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public java.util.Date getDate() {
		return dateCreated;
	}
	
	public void setTrueOrFalse(boolean trueOrFalse) {
		this.trueOrFalse = trueOrFalse;
	}
	
	public boolean getTrueOrFalse() {
		return trueOrFalse;
	}

}
