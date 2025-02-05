package com.classANdObject;

import java.util.Scanner;

class BankAccount
{
	int accountNo;
	String holderName;
	int balance;
	String IFSC;
	
	public void accept() // member functions 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the accountNo : = ");
		accountNo = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the holderName: = ");
		holderName = sc.nextLine();
		System.out.println("enter the IFSC: = ");
		IFSC = sc.nextLine();
		System.out.println("enter the balance : = ");
		balance = sc.nextInt();
	}
	public void display() // member functions 
	{
		System.out.println("accountNo : = "+accountNo);
		System.out.println("holderName : = "+holderName);
		System.out.println("IFSC : = "+IFSC);
		System.out.println("balance  : = "+balance);
	}
	
}
public class BankAccountExample {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.accept();
		ba.display();
		
		
		
		
		
		
		
		
	}
}
