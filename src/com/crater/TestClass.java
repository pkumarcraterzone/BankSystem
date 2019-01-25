package com.crater;

public class TestClass {
	public static void main(String[] args){
		
		Address address = new Address("aaaaa");
		HeadOffice headOffice = new HeadOffice(address, "YesBank");
		
		Manager manager = new Manager(address,"pramod");
		Branch branch = new Branch(address, manager,"noida");
		
		headOffice.registerBranch(branch);
		headOffice.deRegisterBranches(branch);
		
		User user1 = new User(address,"lokesh");
		User user2 = new User(address,"sawan");
		
		
		Account account1 = new CurrentAccount(65464654, 2000, user1);
		Account account2 = new SavingAccount(654465465, 3000, user2);
		
		branch.createAccount(account1);
		branch.createAccount(account2);
		
		System.out.println(user2.creditMoneytoMyAccount(15, branch, user2, account1));
		System.out.println(user2.creditMoneytoMyAccount(15, branch, user2, account2));
		System.out.println(user1.creditMoneytoMyAccount(15, branch, user1, account2));
		System.out.println(user1.creditMoneytoMyAccount(15, branch, user1, account1));
		
		System.out.println(user2.debitMoneyFromMyAccount(30, branch, user2, account2));
		System.out.println(user1.debitMoneyFromMyAccount(30, branch, user2, account2));
		System.out.println(user1.debitMoneyFromMyAccount(30, branch, user1, account2));
		
		
	}
}
