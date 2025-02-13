package com.Abstraction;

public class SavingAccount extends BankAccount{

	private double intrestRate;
	
	public SavingAccount( int accountNo , String holderName, double balance ,Double intrestRate )
	{
		super(accountNo,holderName,balance);
		this.intrestRate = intrestRate ;
		setBalance(balance);
		System.out.println("The Rate of Intrest is : = "+this.intrestRate);
	}
	
	@Override
	public void calculateIntrest() {
		// 10000 * (0.40) = 4000
		
		double bal = getBalance();
		double intrest = (bal * (intrestRate /100));
		credit(intrest);
		System.out.println("Th intrest Rate is : = "+intrest+" is been credited to your bank Account");
			
	}
	
}
