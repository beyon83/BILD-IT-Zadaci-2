package zadaci_09_08_2015;

import java.util.Date;

public class AccountTransaction {
	
	private Date dateOfTransaction;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	/** An empty constructor */
	AccountTransaction() {
		
	}
	
	/** Constructor with type, amount, balance, description, date */
	AccountTransaction(char type, double amount, double balance, String description, Date dateOfTransaction) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		this.dateOfTransaction = dateOfTransaction;
	}
	
	
	/** Getters and Setters */
	public void setType(char type) {
		this.type = type;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public char getType() {
		return type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
    
}
