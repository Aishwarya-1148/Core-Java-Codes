package com.Basics;

public class NumberIsDivisibleBy5And3 {
	public static void main(String[] args) {
		
		int num = 20 ;
		
		if ( num % 3 == 0 && num % 5 == 0 ) {
			System.out.println("Java Language");
		}
		else if( num % 5 == 0 )
		{
			System.out.println(" Language");
		}
		else if ( num % 3 == 0 )
		{
			System.out.println(" Java ");
		}
		else
		{
			System.out.println(" not divisible by 3 or 5 ");
		}
		
		
	}
}
