package com;

public class Account {
	private String accountType;
	public Account()
	{
		
	}
	public Account(String accountType) {
		super();
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
