package com.training.assignment;

public class BankAccount {

	private long accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolderName, double balance) throws NullPointerException{
		super();
		if(accountHolderName != null)
		{
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.balance = balance;
		}
		else
		{
			throw new NullPointerException();
		}
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double depositAmount(double depositAmt) {
		return balance += depositAmt;
	}

	public double withdrawAmount(double withdrawAmt) {
//		int i =0;
//		while(true) i++;
		if(balance > withdrawAmt)
			return balance -= withdrawAmt;
		else 
		{
			return balance-withdrawAmt;
		}
		
	}

}
