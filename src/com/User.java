package com;

public class User {
	private String accountHolderName;
	private long mobileNo;
	private long adharNo;
	private int age;
	private char gender;
	private Account a;
	public User()
	{
		
	}
	public User(String accountHolderName, long mobileNo, long adharNo, int age, char gender) {
		
		this.accountHolderName = accountHolderName;
		this.mobileNo = mobileNo;
		this.adharNo = adharNo;
		this.age = age;
		this.gender = gender;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}
	public void accountHolderDetails()
	{
		System.out.println("Account Holder Name :"+getAccountHolderName());
		System.out.println("Age :"+getAge());
		System.out.println("Mobile Number :"+getMobileNo());
		System.out.println("Adhar Number :"+getAdharNo());
		System.out.println("Gender :"+getGender());
	}
}
