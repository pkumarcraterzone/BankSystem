package com.crater;

public abstract class Account {
	protected long accountNo;
	protected double currentAmount;
	protected User user;
	
	public Account(long accountNo, double currentAmount, User user) {
		super();
		this.accountNo = accountNo;
		this.currentAmount = currentAmount;
		this.user = user;
	}
	
	public abstract double creditMoney(double amount);
	public abstract double debitMoney(double amount);

	public long getAccountNo() {
		return accountNo;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	public User getUser() {
		return user;
	}
	
}
