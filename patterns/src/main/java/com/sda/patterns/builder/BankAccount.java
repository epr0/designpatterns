package com.sda.patterns.builder;

public class BankAccount {

	private int accountNumber;
	private String owner;
	private double balance;
	private String branch;
	private double interestRate;

	private BankAccount() {

	}

	public BankAccount(int accountNumber, String owner, double balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	public BankAccount(int accountNumber, String owner, double balance, String branch, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
		this.branch = branch;
		this.interestRate = interestRate;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank account number [" + this.accountNumber + "]" + " Owner [" + this.owner + "]" + " Balance ["
				+ this.balance + "]";
	}

	public static class Builder {
		private int accountNumber;
		private String owner;
		private String branch;
		private double balance;
		private double interestRate;

		public Builder() {
		}

		public Builder withOwner(String owner) {
			this.owner = owner;
			return this; // By returning the builder each time, we can create a fluent interface.
		}

		public Builder atBranch(String branch) {
			this.branch = branch;
			return this;
		}

		public Builder openingBalance(double balance) {
			this.balance = balance;
			return this;
		}

		public Builder atRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public BankAccount build() {
			// Here we create the actual bank account object, which is always in a fully
			// initialised state when it's returned.
			BankAccount account = new BankAccount(); // Since the builder is in the BankAccount class, we can invoke its
														// private constructor.
			account.accountNumber = this.accountNumber;
			account.owner = this.owner;
			account.branch = this.branch;
			account.balance = this.balance;
			account.interestRate = this.interestRate;
			return account;
		}
	}

}
