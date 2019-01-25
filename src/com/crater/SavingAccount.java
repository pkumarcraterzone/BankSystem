package com.crater;

public class SavingAccount extends Account{

	public SavingAccount(long accountNo, double currentAmount, User user) {
		super(accountNo, currentAmount, user);
	}
	
	public double creditMoney(double amount){
		
		currentAmount=currentAmount+amount-(amount*0.02);
		return currentAmount;
	}
	
	public double debitMoney(double amount){
		currentAmount=currentAmount-amount-(amount*0.02);
		return currentAmount;
	}


}
