package com.Multithreding;

class Account
{
	private int amount;
	public Account(int amt )
	{
		this.amount = amt ;
		System.out.println("The Current Balance is : = "+this.amount);
	}
	
	synchronized public void withdraw(int amt )
	{
		System.out.println("Going to Withdraw : = "+amt);
		while(this.amount < amt )
		{
			System.out.println("INsufficient balance ..! ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amt ;
		System.out.println("Withdraw : = "+amt);
		System.out.println("Remaining Balance is : = "+this.amount);
	}
	
	synchronized public void deposit(int amt )
	{
		System.out.println("Going to Deposit : = "+amt);
		if(amt > 0 )
		{
			this.amount += amt ;
			System.out.println("Deposited : = "+amt);
		}
		else
		{
			System.out.println("Amt should be greater than 0 ...! ");
		}
		notify();
		System.out.println("The updated Balance is : = "+this.amount);
	}
}

class CashDeposit extends Thread 
{	Account b ;
	int amt ;
	
	public CashDeposit (Account b , int amt )
	{
		this.b=b;
		this.amt = amt ;
	}
	public void run()
	{
		b.deposit(amt);
	}
}
class CashWithdraw extends Thread 
{	Account b ;
	int amt ;
	
	public CashWithdraw(Account b , int amt  )
	{
		this.b=b;
		this.amt = amt ;
	}
	public void run()
	{
		b.withdraw(amt);
	}
}
public class InterThreadCommunication {
	public static void main(String[] args) {
		
		// wait() , notify() , notifyAll()
		
		Account acc = new  Account(20000);
		
		CashWithdraw cw1 = new CashWithdraw(acc, 10000);
		CashWithdraw cw2 = new CashWithdraw(acc, 30000);
		
		CashDeposit cd1 = new CashDeposit(acc, 50000);
		
		cw1.start();
		cw2.start();
		
		cd1.start();
		
	}
	
	
}
