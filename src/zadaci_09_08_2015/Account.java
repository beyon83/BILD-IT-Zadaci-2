package zadaci_09_08_2015;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	
	/**
	 * (The Account class) Design a class named Account that contains:
	 * ■ A private int data field named id for the account (default 0).
	 * ■ A private double data field named balance for the account (default 0).
	 * ■ A private double data field named annualInterestRate that stores the current
	 * interest rate (default 0). Assume all accounts have the same interest rate.
	 * ■ A private Date data field named dateCreated that stores the date when the
	 * account was created.
	 * ■ A no-arg constructor that creates a default account.
	 * ■ A constructor that creates an account with the specified id and initial balance.
	 * ■ The accessor and mutator methods for id, balance, and annualInterestRate.
	 * ■ The accessor method for dateCreated.
	 * ■ A method named getMonthlyInterestRate() that returns the monthly
	 * interest rate.
	 * ■ A method named getMonthlyInterest() that returns the monthly interest.
	 * ■ A method named withdraw that withdraws a specified amount from the
	 * account.
	 * ■ A method named deposit that deposits a specified amount to the account.
	 * Draw the UML diagram for the class and then implement the class. (Hint: The
	 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
	 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
	 * is annualInterestRate / 12. Note that annualInterestRate is a percentage,
	 * e.g., like 4.5%. You need to divide it by 100.)
	 * Write a test program that creates an Account object with an account ID of 1122,
	 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
	 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
	 * the balance, the monthly interest, and the date when this account was created.
	*/
	////////////////////////////////////////////////////////////////////////////////////
	                        /** Modifying Account Class */
	////////////////////////////////////////////////////////////////////////////////////
	/**
	 * ■ Add a new data field name of the String type to store the name of the customer.
	 * ■ Add a new constructor that constructs an account with the specified name, id,
	 * and balance.
	 * ■ Add a new data field named transactions whose type is ArrayList
	 * that stores the transaction for the accounts. Each transaction is an instance
	 * of the Transaction class. The Transaction class is defined as shown:
	 * 
	 * -date: java.util.Date         (The date of this transaction.)
	 * -type: char                   (The type of the transaction, such as 'W' for withdrawal, 'D' for deposit.)
	 * -amount: double               (The amount of the transaction.)
	 * -balance: double              (The new balance after this transaction.)
	 * -description: String          (The description of this transaction.)
	 * +Transaction(type: char,      (Construct a Transaction with the specified date, type,
     *  amount: double, balance:       balance, and description.)
	 *  double, description: String)
	 * 
	 * ■ Modify the withdraw and deposit methods to add a transaction to the
	 *   transactions array list.
	 * ■ All other properties and methods are the same as in Programming Exercise 9.7.
	 *   Write a test program that creates an Account with annual interest rate 1.5%,
	 *   balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
	 *   account and withdraw $5, $4, and $2 from the account. Print an account summary
	 *   that shows account holder name, interest rate, balance, and all transactions.
	 */
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	/** Instantiate date for transaction */
	Date transactionDate = new Date();
	
	private String name;
	
	/** Create ArrayList of objects for transactions */
	ArrayList<AccountTransaction> transactions = new ArrayList<>();
	
	/** Empty constructor */
	Account() {
		
	}
	
	/** Constructor with id, balance, annualInterestRate and dateCreated */
	Account(int id, double balance, double annualInterestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}
	
	/** Constructor with name, id, balance and annualIntRate */
	Account(String name, int id, double balance, double annualInterestRate) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	/** Getters and Setters */
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMonthlyInterest() {
		double monthlyInterestRate = this.annualInterestRate / 1200; 
		return monthlyInterestRate * this.balance;
	}
	
	/** Withdrawal method */
	public void withdraw(double amount) {
		this.balance = getBalance() - amount;
		/** Constructor for passing information to the ArrayList */
		AccountTransaction trans = new AccountTransaction('W', amount, balance, "Withdrawal made", transactionDate);
		transactions.add(trans);
	}
	
	/** Deposit method */
	public void deposit(double amount) {
		this.balance = getBalance() + amount;
		/** Constructor for passing informations to the ArrayList */
		AccountTransaction trans = new AccountTransaction('D', amount, balance, "Deposit made", transactionDate);
		transactions.add(trans);
	}
	
	public ArrayList<AccountTransaction> getTransactions() {
		/** Iterate through ArrayList using foreach loop */
		for(AccountTransaction t : transactions) {
			/** Display informations from ArrayList */
			System.out.println("Type: " + t.getType() + " | Amount: " + t.getAmount() + " | Balance: " + t.getBalance() + " | Description: " + t.getDescription() + " | Date: " + t.getDateOfTransaction());
		}
		return transactions;
	}

}
