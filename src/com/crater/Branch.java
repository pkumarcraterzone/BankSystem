package com.crater;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	
	private String name;
	private Address address;
	private Manager manager;
	private List<Account> accounts;
	
	public Branch(Address address, Manager manager, String name) {
		super();
		this.address = address;
		this.manager = manager;
		this.name = name;
		accounts = new ArrayList<>();
	}
	
	public void createAccount(Account account){
		accounts.add(account);
	}
	
	public double creditMoney(double amount, Account account, User user){
		return account.creditMoney(amount);
	}
	
	public double debitMoney(double amount, Account account, User user){
		for(Account acc:accounts){
			if(account.equals(acc) && account.getUser().equals(user)){
				return account.debitMoney(amount);
			}
		}
		return account.getCurrentAmount();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public String getName(){
		return name;
	}
	
	
}
