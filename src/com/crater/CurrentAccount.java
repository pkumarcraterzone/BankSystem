package com.crater;

public class CurrentAccount extends Account{

	public CurrentAccount(long accountNo, double currentAmount, User user) {
		super(accountNo, currentAmount,user);
	}

	public double creditMoney(double amount){

		currentAmount=currentAmount+amount;
		return currentAmount;
	}

	public double debitMoney(double amount){
		currentAmount=currentAmount-amount-(amount*0.01);
		return currentAmount;
	}


}
