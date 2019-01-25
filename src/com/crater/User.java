package com.crater;


public class User {
	protected String name;
	protected Address address;
	protected Account account;

	public User(Address address,String name) {
		
		this.address = address;
		this.name = name;
	}
	
	public Address getHome() {
		return address;
	}
								
	public void setHome(Address address) {
		this.address = address;
	}
	
	public double creditMoneytoMyAccount(double amount,Branch branch, User user, Account account){
		
		return branch.creditMoney(amount, account, user);
		
	}
	public double debitMoneyFromMyAccount(double amount,Branch branch, User user, Account account){
		
		if(user.equals(this)){
			return	branch.debitMoney(amount, account, user);
		}
		return account.getCurrentAmount();
		
	}
	
	public String getName(){
		return name;
	}
}
