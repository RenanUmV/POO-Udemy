package entities;

public class Account {	
		
	private String holder;
	private int accNumber;
	private double balance;
	
	public Account(String holder, int accNumber) {
		this.holder = holder;
		this.accNumber = accNumber;
	}	

	public Account(String holder, int accNumber, double value) {
		this.holder = holder;
		this.accNumber = accNumber;
		deposit(value);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccNumber() {
		return accNumber;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5;		
	}
	
	public String toString() {
		return "Account " 
						+ accNumber 
						+ ", Holder: " 
						+ holder 
						+ ", Balance: $" 
						+ String.format("%.2f", balance);
	}

}
