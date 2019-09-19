package bankingapp;

public class Savings extends Account {
	
	// List properties specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize savings account properties
	public Savings(String name, String ssn, double initialDeposit) {
		super(name, ssn, initialDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID  = (int) (Math.random() * Math.pow(10,  3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,  4));
	}
	
	// List methods specific to the savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
			"  Your Savings Account Features" +
			"\n  Saftey Deposit Box ID: " + safetyDepositBoxID +
			"\n  Saftey Deposit Box Key: " + safetyDepositBoxKey
		);
	}
}
