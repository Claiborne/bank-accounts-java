package bankingapp;

import java.util.LinkedList;
import java.util.List;
import utilities.CSV;

public class BankAccountApp {

	public static void main(String[] args) {
		
		// Create new bank accounts from a CSV file 
		List<Account> bankAccounts = new LinkedList<Account>();
		String file = "data/account_holders.csv";
		List<String[]> newBankAccounts = CSV.read(file);
		for (String[] bankAccount : newBankAccounts) {
			String name = bankAccount[0];
			String ssn = bankAccount[1];
			String accountType = bankAccount[2];
			double initialDeposit = Double.parseDouble(bankAccount[3]);
			
			if(accountType.equals("Checking")) {
				bankAccounts.add(new Checking(name, ssn, initialDeposit));
			} else if(accountType.equals("Savings")) {
				bankAccounts.add(new Savings(name, ssn, initialDeposit));
			} else {
				System.out.println(
					"WARN: " + name + " has invalid account type of " + accountType + 
					". Account type must be Checking or Savings."
				);
			}
		}
		
		// Print out all bank accounts and their information
		System.out.println("Total accounts: " + bankAccounts.size());
		for (Account bankAccount : bankAccounts) {
			bankAccount.showInfo();
			System.out.println("---------------------------------");
		}
	}
}
