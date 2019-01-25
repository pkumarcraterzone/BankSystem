package com.crater;

public class Bank {
	
	private HeadOffice headOffice;
	
	public Bank(HeadOffice headOffice) {
		this.headOffice = headOffice;
	}
  
	public HeadOffice getHeadOffice() {
		return headOffice;
	}

}
