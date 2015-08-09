package zadaci_09_08_2015;

import java.util.Date;

public class AccountMain {

	public static void main(String[] args) {
		
		/** Instantiate date object */
		Date date = new Date();
		
		/** Call constructor and pass arguments to it */
		Account account = new Account(1122, 20000, 4.5, date);
		int id = account.getId(); // get id
		double balance = account.getBalance(); // get balance
		double interestRate = account.getMonthlyInterest(); // get interest rate 
		account.getDateCreated(); // get time of creating an account
		
		account.withdraw(2500); // withdraw from account
		
		System.out.println("id: " + id + ", \nbalance: " + balance + ", \nMonthly interest rate: " + interestRate + "%" + ", \nDate created: " + account.getDateCreated());
		System.out.println("Racun nakon povlacenja $2500 sada iznosi: " + account.getBalance());
		
		account.deposit(3000); // deposit money to the account
		System.out.println("Racun nakon deposita od $3000 iznosi: " + account.getBalance());
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		/** Call constructor again, and create new account */
		Account account2 = new Account("George", 1122, 1000, 1.5);
		account2.deposit(30);
		account2.deposit(40);
		account2.deposit(50);
		account2.withdraw(5);
		account2.withdraw(4);
		account2.withdraw(2);
		System.out.println("Account name: " + account2.getName());
		System.out.println("Interest rate: " + account2.getAnnualInterestRate());
		System.out.println("Balance: " + account2.getBalance());
		System.out.println(account2.getTransactions());
		
		
	}

}
