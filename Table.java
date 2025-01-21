package com.Basics;

public class Table {
	public static void main(String[] args) {
		int n = 6;
		
		// for factorial calculation 
		int fact = 1 ;
		for(int i = 1 ; i <= n ; i = i + 1 )
		{
			fact = fact * i ;
		}
		System.out.println("THe factorial of the number "+n+" is : = "+fact);
		
		
		/*// for printing even numbers 
		for(int i = 1 ; i <= n ;i = i + 1 )
		{
			if (i % 2 == 1 ) {
				System.out.println(i);
			}
		}
		
		// for printing the 2's table
		for(int i = 1 ; i <= 10 ; i = i + 1 )
		{
			System.out.println(n * i);
		}
		*/
		
	}
}
