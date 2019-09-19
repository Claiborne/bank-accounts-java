package bankingapp;

public class Checking extends Account {

	// List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initialDeposit) {
		super(name, ssn, initialDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10,  16));
		debitCardPin    = (int) (Math.random() * Math.pow(10,  4));
	}
	
	// List methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println(
			"  Your Checking Account Features" +
			"\n  Debit Card Number: " + debitCardNumber +
			"\n  Debit Card PIN: " +debitCardPin
		);
	}
}
