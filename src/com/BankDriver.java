package com;

import java.util.Random;
import java.util.Scanner;

public class BankDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		Random r=new Random();
		boolean start=true;
		while(start)
		{
			System.out.println("Welcome to LOOT Bank");
			System.out.println("Select your Options : \n1.Create User \n2.CreateAccount \n3.Deposite \n4.Withdraw");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter AccountHolderName");
				String accountHolderName=sc.next();
				System.out.println("Enter Mobile Number");
				long moblieNo=sc.nextLong();
				System.out.println("Enter the Adhar No");
				long adharNo=sc.nextLong();
				System.out.println("Enter Age");
				int age=sc.nextInt();
				System.out.println("Enter the Gender");
				char gender=sc.next().charAt(0);
				b.setU(new User(accountHolderName,moblieNo,adharNo,age,gender));
				System.out.println("User Created Sucessfully");
				break;
			}
			case 2:
			{
				System.out.println("Enter the Account Type");
				String accountType=sc.next();
				b.getU().setA(new Account(accountType));
				System.out.println("Account Created Sucessfully");
				System.out.println("Your Account No:"+r.nextInt(10000000));
				break;
			}
			case 3:
			{
				System.out.println("Enter The Deposite Amount");
				int amount=sc.nextInt();
				b.deposite(amount);
				break;
			}
			case 4:
				System.out.println("Enter The WithDraw Amount");
				int amount=sc.nextInt();
				b.deposite(amount);
			}
		}
	}
}
