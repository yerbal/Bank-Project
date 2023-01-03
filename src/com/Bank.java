package com;

public class Bank {
	private String bankName;
	private String branch;
	private String ifscCode;
	private User u;
	int balance =0;
	public Bank()
	{
		
	}
	public Bank(String bankName, String branch, String ifscCode) {
		
		this.bankName = bankName;
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void createUser(User u)
	{
		if(this.u==null)
		{
			this.u=u;
		}
		else
		{
			System.out.println("User not yet Created :");
		}
	}
	public void deposite(int amount)
	{
		balance+=amount;
		System.out.println("Currenr Balance :"+balance);
	}
	public void withDraw(int amount)
	{
		balance-=amount;
		System.out.println("Current Balance :"+balance);
	}
}
