package com.Abstraction;

public abstract class BankAccount {
	
	private int accountNo;
	private String holderName;
	private double balance;
	

	public BankAccount(int accountNo, String hoderName, double balance) {
		this.accountNo = accountNo;
		this.holderName = hoderName;
		this.balance = balance;
//		System.out.println("------------ the details are ------------ ");
//		System.out.println("accoutn no "+this.accountNo);
//		System.out.println("holderName "+this.holderName);
//		System.out.println("balanc"+this.balance);
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getHoderName() {
		return holderName;
	}
	public void setHoderName(String hoderName) {
		this.holderName = hoderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public void credit(double amt)
	{
		if (amt > 0 ) {
			this.balance = this.balance + amt;
			System.out.println("Amount is credited ...! ");
		}
		else
		{
			System.out.println("Amount is less than 0 ...! ");
		}
	}
	
	public void bebit(double amt )
	{
		if (amt > 0 && amt < this.balance) {
			this.balance = this.balance - amt ;
			System.out.println("The Amount is debited");
		}
		else
		{
			System.out.println("the Amt should be Greathan than 0 and less than curent balance ...! ");
		}
	}
	
	// this is abstract method 
	abstract public void calculateIntrest();
			
}
