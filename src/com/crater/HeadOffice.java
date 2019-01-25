package com.crater;

import java.util.ArrayList;
import java.util.List;

public class HeadOffice {
	private Address address;
	private String BankName;
	private List<Branch> registeredBranches;
	
	public HeadOffice(Address address, String bankName) {
		super();
		this.address = address;
		BankName = bankName;
		registeredBranches = new ArrayList<Branch>();
	}
	//
	public void registerBranch(Branch branch){
		registeredBranches.add(branch);
	}
	public void deRegisterBranches(Branch branch){
		registeredBranches.remove(branch);
	}
	
	//
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getBankName() {
		return BankName;
	}
	
	public List<Branch> getRegisteredBranches() {
		return registeredBranches;
	}

	
	
	
}
