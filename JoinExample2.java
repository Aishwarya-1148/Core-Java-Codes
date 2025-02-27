package com.Multithreding;

class BankAccount
{
	private int bal;
	public void deposit(int amt )
	{
		bal += amt;
		System.out.println("Deposit Successful New Balnace : = "+this.bal);
	}
	
	public void withdraw(int amt )
	{
		if(bal >= amt )
		{
			bal -= amt;
			System.out.println("Withdraw Successful New Balnace : = "+this.bal);
		}
	}
}
class Deposit extends Thread 
{	BankAccount b ;
	
	public Deposit(BankAccount b )
	{
		this.b=b;
	}
	public void run()
	{
		b.deposit(7000);
	}
}
class Withdraw extends Thread 
{	BankAccount b ;
	
	public Withdraw (BankAccount b )
	{
		this.b=b;
	}
	public void run()
	{
		b.withdraw(3000);
	}
}

public class JoinExample2 {
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		
		Deposit d = new Deposit(b);
		Withdraw w = new Withdraw(b);
		
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		w.start();
		
		System.out.println("The main Thread is running ...! ");
			
	}
}
