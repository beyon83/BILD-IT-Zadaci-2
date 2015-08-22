package zadaci_20_08_2015;

public class IllegalArgumentExceptionTest {
	
	/**
	 * Zadatak: 5
	 * 
	 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
	 * throw IllegalArgumentException if the loan amount, interest rate, or
	 * number of years is less than or equal to zero.
	 */

	public static void main(String[] args) {
		
		/** Invoke Loan constructor with arguments for AnnualInterestRate, NumberOfYears and LoanAmount */
		Loan loan = new Loan(0, 10, 1000);
	//	loan.setAnnualInterestRate(0);
	//	loan.setLoanAmount(-1);
	//	loan.setNumberOfYears(0);
		
		try {
			/** If interest rate, number of years or loan amount are lower or equal to zero... */
			if(loan.getAnnualInterestRate() <= 0 || loan.getNumberOfYears() <= 0 || loan.getLoanAmount() <= 0) {
			//	IllegalArgumentException ex = new IllegalArgumentException();
			//	throw ex;
				/** ...throw an exception */
				throw(new IllegalArgumentException());
			}
			/** If input is positive number, display result */
			System.out.println("Annual interest rate: " + loan.getAnnualInterestRate());
			System.out.println("Number of years: " + loan.getNumberOfYears());
			System.out.println("Loan amount: " + loan.getLoanAmount());
			
		/** Catch exception and display error message */	
		} catch(IllegalArgumentException ex) {
			System.out.println("Your input is incorrect! \nInput for interest rate, number of years and loan amount must be positive number. " + ex);
		}
		
	}

}

///////////////////////////////////////////////////////////////
                    /** Loan Class */
///////////////////////////////////////////////////////////////

class Loan {
	
	/** Date fields */
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	/** Construct a loan with specified annual interest rate, 
	 * number of years, and loan amount */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		if(annualInterestRate <= 0) {
			/** If annualInterestRate is lower or equal to zero, throw an exception */
			throw(new IllegalArgumentException("annualInterestRate can't be lower or equal to zero."));
		} else {
			this.annualInterestRate = annualInterestRate;
		}
	}
	
	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		if(numberOfYears <= 0) {
			/** If numberOfYears is lower or equal to zero, throw an exception */
			throw(new IllegalArgumentException("numberOfYears can't be lower or equal to zero."));
		} else {
			this.numberOfYears = numberOfYears;
		}
	}
	
	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}
	
	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		if(loanAmount <= 0) {
			/** If loanAmount is lower or equal to zero, throw an exception */
			throw(new IllegalArgumentException("loanAmount can't be lower or equal to zero."));
		} else {
			this.loanAmount = loanAmount;
		}
	}
	
	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}