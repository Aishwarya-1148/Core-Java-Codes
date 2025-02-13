package com.Abstraction;

public class AbstarctClass {

	public static void main(String[] args) {

		// 1] abstarct class : which has a abstarct method 
		// 2] interface 
		// we cant create the obj of abstract class 
		//
		
		SavingAccount sa = new SavingAccount(123456, "Aishwarya", 10000,60.00);
		sa.calculateIntrest();
		System.out.println("the BAnk Balance is : = "+sa.getBalance());	

		// 10000 + 4000 = 14000
		
	}

}
